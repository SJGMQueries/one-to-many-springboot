package com.javatechie.one2many.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.one2many.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
