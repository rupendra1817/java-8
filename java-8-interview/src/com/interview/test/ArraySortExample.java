package com.interview.test;

public class ArraySortExample {

	public static void main(String[] args) {
		int[] items = { 200, 20, 30, 400, 100, 80, 70, 1 };
		int temp = 0;

		System.out.println("Actual: ");
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i] + "\t");
		}

		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - 1; j++) {
				for (int k = 0; k < items.length; k++) {
					if (items[j] > items[j + 1]) {
						temp = items[j + 1];
						items[j + 1] = items[j];
						items[j] = temp;
					}
				}
			}
		}

		System.out.println("\nSorted (Using Bubble sort): ");
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i] + "\t");
		}
	}
}
