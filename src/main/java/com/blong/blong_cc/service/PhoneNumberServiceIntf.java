package com.blong.blong_cc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.blong.blong_cc.model.Customer;

public interface PhoneNumberServiceIntf {
	public static Map<String, Integer> PhoneNumbers = new HashMap<String, Integer>();
	public List<String> getAllPhoneNumbers();
	public List<String> getPhoneNumbersByCustomer(Customer c);
}
