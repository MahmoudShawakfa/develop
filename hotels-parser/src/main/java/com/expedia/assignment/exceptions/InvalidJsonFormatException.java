package com.expedia.assignment.exceptions;

public class InvalidJsonFormatException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidJsonFormatException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidJsonFormatException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidJsonFormatException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidJsonFormatException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidJsonFormatException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
