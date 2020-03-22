package com.string.handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<String>  mylist = new ArrayList<String>();
        mylist.add("amit");
        mylist.add("rahul");
        mylist.add("amit");
        mylist.add("deepak");
        mylist.add("sanjay");
        mylist.add("sanjay");
        mylist.add("sanjay");
        mylist.add("deepak");
  
        int freq = Collections.frequency(mylist, "deepak");
        System.out.println(freq);
	}
}
