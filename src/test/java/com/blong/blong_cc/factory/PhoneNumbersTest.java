package com.blong.blong_cc.factory;
import static com.blong.blong_cc.factory.PhoneNumbers.getPhoneNumber;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class PhoneNumbersTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPhoneNumber() {
		assertNotNull(getPhoneNumber());
	}

}
