package com.blong.blong_cc.service;

import static com.blong.blong_cc.factory.Customers.getCustomer;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blong.blong_cc.exception.CustomerServiceException;
import com.blong.blong_cc.model.Customer;
import com.blong.blong_cc.model.GeneratorProperties;

@Service
public class CustomerServiceImpl implements CustomerServiceIntf {
	private static final Logger LOG = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	public CustomerServiceImpl(GeneratorProperties generatorProperties) {
		LOG.info("Construct CustomerServiceImpl object...");
		Customer c = null;
		Integer pc = Integer.valueOf(generatorProperties.getNumberCustomer());
		for (int i = 0; i < pc; i++) {
			c = getCustomer();
			c.setName("Customer-" + i);
			customers.add(c);
		}
	}

	public List<Customer> getAllCustomers() {
		if (customers.size() <= 0) {
			throw new CustomerServiceException("No customer found");
		}
		return customers;
	}

	public Customer getCustomerById(Integer id) {
		List<Customer> cl = customers.stream().filter(c -> c.getId() == id).collect(Collectors.toList());
		if (cl.size() > 1) {
			throw new CustomerServiceException("Duplicate customer");
		} else if (cl.size() < 1) {
			throw new CustomerServiceException("No customer found");
		}
		return cl.get(0);
	}
}
