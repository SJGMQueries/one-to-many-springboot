package com.javatechie.one2many.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.one2many.api.model.Customer;
import com.javatechie.one2many.api.repository.CustomerRepository;

@RestController
@Transactional
public class ShoppingController {
	
	@Autowired
	private CustomerRepository customerRepository;
	@PostMapping("/savePurchase")
	public String saveCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return "Record Saved";
	}

}
