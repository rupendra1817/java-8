package com.hcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThirdQuestion {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);

		Iterator<Integer> itr = myList.iterator();
		while (itr.hasNext()) {
			int number = itr.next();
			System.out.println(number);
			if (number == 4) {
				myList.add(1);
				//myList.remove(number);
			}
		}
	}
}
