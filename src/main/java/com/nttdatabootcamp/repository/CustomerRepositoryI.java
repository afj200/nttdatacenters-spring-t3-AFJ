package com.nttdatabootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryI extends JpaRepository<Customer, Integer>{
	
	/**
	 * Método para obtener clientes por su nombre y apellidos.
	 * 
	 * @param name
	 * @param lastName
	 * @return List<Customer>
	 */
	public List<Customer> findByNameAndLastName(final String name, final String lastName);

}
