package com.hcl;

public class SecondQuestion {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			throw new Exception();
		} catch (Exception e) {
			System.exit(0);
		}finally {
			System.out.println("finally");
		}

	}

}
