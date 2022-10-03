package com.nttdatabootcamp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdatabootcamp.repository.Customer;
import com.nttdatabootcamp.repository.CustomerRepositoryI;

@Service
@Primary
public class CustomerServiceImpl implements CustomerServiceI{

	/** Repositorio de cliente */
	@Autowired
	private CustomerRepositoryI customerRepository;
	
	@Override
	public Customer insertNewCustomer(Customer newCustomer) {
		if (newCustomer != null && newCustomer.getId() == null) {
			
			newCustomer = customerRepository.save(newCustomer);
		}
		return newCustomer;
	}

	@Override
	public List<Customer> searchAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(Customer deletedCustomer) {
		
		customerRepository.delete(deletedCustomer);
		
	}

	@Override
	public void updateCustomer(Customer updatedCustomer) {
		
		customerRepository.save(updatedCustomer);
		
	}

	@Override
	public List<Customer> searchByFullName(String name, String lastName) {
	
		return customerRepository.findByNameAndLastName(name, lastName);
	}

}
