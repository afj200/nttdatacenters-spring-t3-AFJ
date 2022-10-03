package com.nttdatabootcamp.services;

import java.util.List;

import com.nttdatabootcamp.repository.Customer;

public interface CustomerServiceI {

	/**
	 * Añade un nuevo cliente.
	 * 
	 * @param newCustomer
	 * @return Customer
	 */
	public Customer insertNewCustomer(final Customer newCustomer);
	
	/**
	 * Consulta todos los clientes.
	 */
	public List<Customer> searchAllCustomers();

	/**
	 * Método para eliminar un cliente por su id.
	 * 
	 * @param deletedCustomer
	 */
	public void deleteCustomer(Customer deletedCustomer);
	
	/**
	 * Método para actualizar un cliente.
	 * 
	 * @param Customer
	 */
	public void updateCustomer(Customer updatedCustomer);
	
	/**
	 * Búsqueda de cliente por nombre completo.
	 * 
	 * @param name
	 * @param lastName
	 */
	public List<Customer> searchByFullName(final String name, final String lastName);
}
