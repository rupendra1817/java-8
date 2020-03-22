package com.string.handling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 20, 30, 20, 40, 50, 60, 60 };
		
		List<Integer> arrList = Arrays.asList(arr);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (Integer integer : arrList) {
			map.put(integer, Collections.frequency(arrList, integer));
		}

		System.out.println("Number \t Frequency");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
