package com.exception.handling;

public class TestVoterException {

	public static void main(String[] args) {

		TestVoterException testVoterException = new TestVoterException();

		try {
			testVoterException.voterValidator(18);
			testVoterException.voterValidator(17);
		} catch (InvalidVoterException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public boolean voterValidator(int age) throws InvalidVoterException {
		if (age < 18) {
			throw new InvalidVoterException("Not a valid voter.");
		} else {
			return true;
		}
	}
}
