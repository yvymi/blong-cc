package com.blong.blong_cc.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.blong.blong_cc.model.Customer;

import static com.blong.blong_cc.factory.Customers.*;

public class CustomersTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCustomer() {
		Customer c = getCustomer();
		assertNotNull(c);
	}

}
