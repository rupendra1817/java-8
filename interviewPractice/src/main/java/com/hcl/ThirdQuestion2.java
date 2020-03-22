package com.hcl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ThirdQuestion2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		map.put("6", 6);

		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println("Key : " + key + " Value: " + value);
			if (key.equals("5")) {
				map.put("7", 7);
				// map.remove("1");
			}
		}
	}
}