package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add('a');
		list.add(1);
		list.add(500.00);
		list.add("rupendra");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
