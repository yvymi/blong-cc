package com.blong.blong_cc.factory;

import org.springframework.stereotype.Component;

import com.blong.blong_cc.model.Customer;

@Component
public class Customers {
	private static Integer nextCustomerId = 0;

	public static synchronized Customer getCustomer() {
		int nid = getNextCustomerId();
		Customer c = new Customer(nid, "Customer-" + nid );
		return c;
	}

	private static Integer getNextCustomerId() {
		synchronized (nextCustomerId) {
			return nextCustomerId++;
		}
	}
}
