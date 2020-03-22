package com.multithreading;

public class Test {

	public static void main(String[] args) {

		Account account1 = new Account();

		Runnable runnable1 = () -> {
			for (int i = 0; i < 10; i++) {
				account1.read();
			}

		};

		Runnable runnable2 = () -> {
			for (int i = 0; i < 10; i++) {
				account1.write();
			}
		};

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();

	}

}
