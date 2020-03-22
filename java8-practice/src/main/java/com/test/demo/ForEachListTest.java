package com.demo;

import java.util.HashMap;
import java.util.Map;

public class ForEachListTest {

	public static void main(String[] args) {
		Map<String, Integer> details = new HashMap<>();
		details.put("A", 100);
		details.put("B", 200);
		details.put("C", 300);
		details.put("D", 400);
		details.put("E", 500);
		details.put("F", 600);

		for (Map.Entry<String, Integer> detail : details
				.entrySet()) {
			System.out.println("Name : " + detail.getKey()
					+ " Roll No : " + detail.getValue());
		}

		details.forEach((k, v) -> System.out.println(
				"Name : " + k + " Roll No : " + v));

		details.forEach((k, v) -> {
			System.out.println(
					"Name : " + k + " Roll No : " + v);

			if ("D".equals(k)) {
				System.out.println("Welcome D");
			}
		});

	}
}
