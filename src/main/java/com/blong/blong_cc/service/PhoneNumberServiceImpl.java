package com.blong.blong_cc.service;

import static com.blong.blong_cc.factory.PhoneNumbers.getPhoneNumber;
import static com.blong.blong_cc.service.CustomerServiceIntf.getRandomCustomer;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blong.blong_cc.model.Customer;
import com.blong.blong_cc.model.GeneratorProperties;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberServiceIntf {

	private static final Logger LOG = LoggerFactory.getLogger(PhoneNumberServiceImpl.class);
	@Autowired
	public PhoneNumberServiceImpl(GeneratorProperties generatorProperties) {
		LOG.info("Construct PhoneNumberServiceImpl Object...");
		Customer c = null;
		Integer cn = Integer.valueOf(generatorProperties.getPhoneNumber());
		for (int i = 0; i < cn; i++) {
			if ((c = getRandomCustomer()) != null) {
				PhoneNumbers.put(getPhoneNumber(), c.getId());
			}
		}
	}

	public List<String> getAllPhoneNumbers() {
		return PhoneNumbers.keySet().stream().collect(Collectors.toList());
	}

	public List<String> getPhoneNumbersByCustomer(Customer c) {
		return PhoneNumbers.entrySet().stream().filter(e -> e.getValue() == c.getId()).map(x -> x.getKey())
				.collect(Collectors.toList());
	}
}
