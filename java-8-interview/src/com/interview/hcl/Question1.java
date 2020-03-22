package com.interview.hcl;

public class Question1 extends Test1 {
	Question1() {
	}
	public static void main(String[] args) {
		System.out.println(count);
		Test1 test1 = new Test1();
		System.out.println(count);
	}
}

class Test1 {
	public static int count = 0;

	Test1() {
		count++;
	}
}