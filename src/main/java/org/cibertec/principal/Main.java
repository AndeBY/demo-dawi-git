package org.cibertec.principal;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.cibertec.model.Examen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Examen");
		EntityManager manager = factory.createEntityManager();
		
		//Buscar un registro en una tabla de la bdatos
		Examen user = manager.find(Examen.class, 1);
		System.out.println(user.getNombre());
		
		
		//Insertar un registro en una tabla de la bdatos
		  Examen userPersist = new Examen();
		  userPersist.setDoctor("Jesus");
		  userPersist.setDescripcion("A cargo del piso 2");
		  userPersist.setApellido("Barreto");
		  //userPersist.setNombre("Abel"); 
		  //userPersist.setApellido("Martinez");
		  //userPersist.setClave("ABCDE"); 
		 // userPersist.setEstado(1); 
		  //userPersist.setFnacim(Date.valueOf("1990-12-31"));
		  //userPersist.setTipo(1);
		  //userPersist.setUsuario("amartinez");
		  
		  //manager.getTransaction().begin();
		  //manager.persist(userPersist);
		  //manager.getTransaction().commit();
		  
		  
		  
		  Examen userFind = manager.find(Examen.class, 1);
	      System.out.println(userFind.getNombre());
		  
	      //Actualizar el registro del Usuario
	      Examen userUpdate = manager.find(Examen.class, 1);
	      userUpdate.setNombre("Ricardo");
	      
	      manager.getTransaction().begin();
	      manager.merge(userUpdate);
	      manager.getTransaction().commit();
	      
	      //Eliminar registro del Usuario
	      Examen userDelete = manager.find(Examen.class, 2);

	      manager.getTransaction().begin();
	      manager.remove(userDelete);
	      manager.getTransaction().commit();
	      
		  //List<Usuario> simpleObjectList = manager.createNamedQuery("Usuario.findAll").getResultList();
	      //  for(Usuario user : simpleObjectList){
	      //      System.out.println(user);
	      //}
	
		
	}

}

