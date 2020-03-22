package com.multithreading;

public class Account {

	boolean flag = false;
	int data = 0;
	int i = 0;

	public synchronized void read() {
		if (flag == true) {
			System.out.println("Data read successfully : " + data);
			flag = false;
			notify();
		} else {
			try {
				System.out.println("Waiting for writing data.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public synchronized void write() {
		if (flag == false) {
			System.out.println("Data write successfully.");
			data = i++;
			flag = true;
			notify();
		} else {
			try {
				System.out.println("Waiting for the reading data.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
