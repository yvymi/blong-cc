package com.blong.blong_cc.exception;

public class CustomerServiceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8231645148442691538L;

	public CustomerServiceException() {
		super();
	}
	
	public CustomerServiceException(String msg) {
		super(msg);
	}
	
	public CustomerServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
