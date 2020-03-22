package com.test;

public class TestLambdaExp {

	public static void main(String[] args) {
		ArithmeticOpeation result1 = (int a, int b) -> (a + b);
		System.out.println("Result 1 : " + result1.sum(10, 10));

		ArithmeticOpeation result2 = (a, b) -> (a + b);
		System.out.println("Result 2 : " + result2.sum(20, 20));

		ArithmeticOpeation result3 = (a, b) -> {
			return (a + b);
		};
		System.out.println("Result 3 : " + result3.sum(30, 30));
	}
}
