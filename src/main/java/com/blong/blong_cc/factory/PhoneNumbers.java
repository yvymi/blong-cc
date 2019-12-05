package com.blong.blong_cc.factory;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PhoneNumbers {
	
	//Simply generate a ten digits phone number
	public static String getPhoneNumber() {
		Random r = new Random();
		Integer pn = r.nextInt(1_000_000_000);
		return "0" + pn;
	};
}
