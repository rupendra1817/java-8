package com.oca.exam.practice;

public class Vard {
	public static void main(String... a) {
		new Vard().go(a, 42);
	}

	void go(String[] b, int life) {
		System.out.println(b[1]);
	}
}
