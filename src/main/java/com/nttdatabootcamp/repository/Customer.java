package com.nttdatabootcamp.repository;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")
public class Customer implements Serializable{

	/** SERIAL */
	private static final long serialVersionUID = 1L;
	
	/* Identificador numérico */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private Long Id;
	
	/* Nombre del cliente*/
	@Column(name = "C_NAME", nullable = false)
	private String name;
	
	/* Apellidos del cliente */
	@Column(name = "C_LASTNAME", nullable = false)
	private String lastName;
	
	/* Fecha de nacimientop del cliente */
	@Column(name = "C_BIRTHDAY", nullable = false)
	private Date birthday;
	
	/* Número de documento de identidad del cliente */
	@Column(name = "C_DNI", nullable = false)
	private String dni;
	
	/* Getters y Setters */
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/* Método toString */
	@Override
	public String toString() {
		return " : [Id=" + Id + ", name=" + name + ", lastName=" + lastName + ", birthday=" + birthday + ", dni="
				+ dni + "]";
	}
	
	
}
