package com.test;

@FunctionalInterface
public interface Sayable {

	public void say(String msg);

	default void doIt() {
		System.out.println("Do it now");
	}
	
	public static void t() {
		System.out.println("*************");
	}
}
