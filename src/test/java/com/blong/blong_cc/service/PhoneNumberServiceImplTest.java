package com.blong.blong_cc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blong.blong_cc.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class PhoneNumberServiceImplTest {

	private Customer c; 
	
	@Autowired
	private PhoneNumberServiceImpl psi;
	
	@Before
	public void setUp() throws Exception {
		c = new Customer(0, "Customer-0");
	}

	@Test
	public void testGetAllPhoneNumbers() {
		assertEquals(psi.getAllPhoneNumbers().size(), 100);
	}
	
	@Test
	public void testGetPhoneNumbersByCustomer() {
		assertNotNull(psi.getPhoneNumbersByCustomer(c));
	}

}
