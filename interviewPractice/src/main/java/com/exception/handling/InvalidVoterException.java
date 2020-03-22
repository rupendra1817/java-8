package com.exception.handling;

public class InvalidVoterException extends Exception {

	private static final long serialVersionUID = 5784620877531741861L;

	public InvalidVoterException() {

	}

	public InvalidVoterException(String message) {
		super(message);

	}

	public InvalidVoterException(Throwable cause) {
		super(cause);

	}

	public InvalidVoterException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvalidVoterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}
}
