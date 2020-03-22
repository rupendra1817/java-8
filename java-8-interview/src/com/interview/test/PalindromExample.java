package com.interview.test;

public class PalindromExample {

	public static void main(String[] args) {
		int number = 1441;
		int r = 0;
		int sum = 0;
		int temp = number;

		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}

		if (temp == sum) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
	}
}