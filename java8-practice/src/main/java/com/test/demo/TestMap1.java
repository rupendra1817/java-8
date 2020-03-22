package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap1 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("1", "2",
				"3", "4", "5");

		List<Integer> numberList = stringList.stream()
				.map(x -> Integer.valueOf(x))
				.collect(Collectors.toList());

		numberList.stream()
				.forEach(x -> System.out.println(x));

	}

}
