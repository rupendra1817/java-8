package com.string.handling;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	/**
	 * Program to count word frequency.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		String message = "abc xyz abc ab xy xyz abc xy";
		System.out.println(message);

		List<String> str = Arrays.asList(message.split(" "));
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String string : str) {
			map.put(string, Collections.frequency(str, string));
		}

		System.out.println("Word \t Frequency");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
