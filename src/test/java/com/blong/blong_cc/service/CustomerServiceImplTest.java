package com.blong.blong_cc.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class CustomerServiceImplTest {

	@Autowired
	private CustomerServiceImpl csi;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAllCustomers() {
		assertEquals(csi.getAllCustomers().size(), 10);
	}
	
	@Test
	public void TestGetPhoneNumbersByCustomer() {
		assertEquals(csi.getCustomerById(0).getName(), "Customer-0");
	}

}
