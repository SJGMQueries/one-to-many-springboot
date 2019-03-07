package com.javatechie.one2many.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="cust_id")
	private int custId;
	private String custName;
	@OneToMany(mappedBy="customer",cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Product> products;

}
