package com.javatechie.one2many.api.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private int price;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "cust_id")
	private Customer customer;
}
