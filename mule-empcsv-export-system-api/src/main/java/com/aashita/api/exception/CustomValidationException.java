package com.aashita.api.exception;

public class CustomValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	private final String error;

	public CustomValidationException(String error) {
		super(error);
		this.error = error;
	}

	public CustomValidationException(String error, Throwable cause) {
		super(error, cause);
		this.error = error;
	}

	public CustomValidationException(String error, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(error, cause, enableSuppression, writableStackTrace);
		this.error = error;
	}

	public String getError() {
		return this.error;
	}

}
