package com.github.training.customers;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SpringBootApplication
public class CustomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}
}

@Data
@Table(name = "customers")
@Entity
class Customer {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String address;
}

@CrossOrigin("*")
@RepositoryRestResource
interface CustomerRepository extends JpaRepository<Customer, Long> {

}