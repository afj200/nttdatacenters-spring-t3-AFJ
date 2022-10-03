package com.nttdatabootcamp;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdatabootcamp.repository.Customer;
import com.nttdatabootcamp.services.CustomerServiceI;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NttdatacentersSpringT3AfjApplication implements CommandLineRunner{

	/** Servicio de gestión de clientes */
	@Autowired
	private CustomerServiceI customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringT3AfjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Nuevo cliente */
		Customer customer = new Customer();
		customer.setId((long) 1);
		customer.setName("Angel");
		customer.setLastName("Jimenez");
		customer.setDni("12345678A");
		Date birthday = new Date(02, 02, 1999);
		customer.setBirthday(birthday);
		
		Customer customer2 = new Customer();
		customer2.setId((long) 2);
		customer2.setName("Joaquin");
		customer2.setLastName("Perez");
		customer2.setDni("12345678G");
		Date birthday2 = new Date(04, 04, 1998);
		customer.setBirthday(birthday2);
		
		/* Insertar clientes en la BBDD */
		customerService.insertNewCustomer(customer);
		customerService.insertNewCustomer(customer2);
		
		/* Obtener todos los clientes */
		
		List<Customer> listCustomer = customerService.searchAllCustomers();
		
		for(Customer searchedCustomer : listCustomer) {
			System.out.println("Lista de clientes" + searchedCustomer);
		}
		
		/* Actualizar un cliente */
		
		customer2.setName("Manuel");
		
		customerService.updateCustomer(customer2);
		
		/* Buscar un cliente por su nombre y apellido */
		
		listCustomer = customerService.searchByFullName(customer2.getName(), customer2.getLastName());
		
		for(Customer searchedCustomer : listCustomer) {
			System.out.println("Cliente buscado por su nombre y apellidos" + searchedCustomer);
		}
		
		/* Eliminar un cliente */
		
		customerService.deleteCustomer(customer2);
		
		listCustomer = customerService.searchAllCustomers();
		
		for(Customer searchedCustomer : listCustomer) {
			System.out.println("Lista de clientes final" + searchedCustomer);
		}
		
	}

}
