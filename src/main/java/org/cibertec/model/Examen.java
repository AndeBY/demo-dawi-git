package org.cibertec.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_examen database table.
 * 
 */
@Entity
@Table(name="tb_examen")
@NamedQuery(name="Examen.findAll", query="SELECT e FROM Examen e")
public class Examen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;

	private String apellido;

	private String descripcion;

	private String doctor;

	@Override
	public String toString() {
		return "Examen [codigo=" + codigo + ", apellido=" + apellido + ", descripcion=" + descripcion + ", doctor="
				+ doctor + ", edad=" + edad + ", nombre=" + nombre + ", tipo=" + tipo + ", usuario=" + usuario + "]";
	}

	@Temporal(TemporalType.DATE)
	private Date edad;

	private String nombre;

	private int tipo;

	private String usuario;

	public Examen() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDoctor() {
		return this.doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public Date getEdad() {
		return this.edad;
	}

	public void setEdad(Date edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Examen(String apellido, String descripcion, String doctor, Date edad, String nombre, int tipo,
			String usuario) {
		super();
		this.apellido = apellido;
		this.descripcion = descripcion;
		this.doctor = doctor;
		this.edad = edad;
		this.nombre = nombre;
		this.tipo = tipo;
		this.usuario = usuario;
	}

}