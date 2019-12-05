package com.blong.blong_cc.model;

public class PhoneNumber {
	private String phoneNumber;
	private Integer customerId;
	private boolean activated = false;
	
	public PhoneNumber(String phoneNumber, Integer customerId) {
		this.phoneNumber = phoneNumber;
		this.customerId = customerId;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
}
