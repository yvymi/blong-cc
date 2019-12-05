package com.blong.blong_cc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.blong.blong_cc.exception.CustomerServiceException;
import com.blong.blong_cc.model.Customer;

public interface CustomerServiceIntf {
	public static List<Customer> customers = new ArrayList<Customer>();
	public static Customer getRandomCustomer() {//return a random customer from list
		if ( customers.size() -1 < 0 ) {
			throw new CustomerServiceException("No customer available");
		}
		Random r = new Random();
		int ri = r.nextInt(customers.size());
		
		return customers.get(ri);
	}
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(Integer id);
}