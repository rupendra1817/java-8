package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap2 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("a", "b",
				"c", "d", "e");

		List<String> upperCaseList1 = stringList.stream()
				.map(x -> x.toUpperCase())
				.collect(Collectors.toList());

		// Output: [A, B, C, D, E]
		System.out.println(upperCaseList1);

		// Using method reference technique
		List<String> upperCaseList2 = stringList.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		// Output: [A, B, C, D, E]
		System.out.println(upperCaseList2);

	}
}
