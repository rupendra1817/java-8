package com.interview.hcl;

public class Question5 {
	public static void main(String[] args) {

		try {
			throw new MyCustomException("Problem Occurs", new NumberFormatException());
		} catch (MyCustomException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}

class MyCustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyCustomException(String msg, Exception exception) {
		super(msg, exception);
	}
}
