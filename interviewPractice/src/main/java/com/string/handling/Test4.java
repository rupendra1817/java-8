package com.string.handling;

import java.util.Arrays;
import java.util.Collections;

public class Test4 {

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 20, 30, 20, 40, 50 };
		int freq = Collections.frequency(Arrays.asList(arr), 20);
		System.out.println(freq);
	}
}
