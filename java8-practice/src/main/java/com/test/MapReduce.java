package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapReduce {

	public static void main(String args[]) {
		List<Integer> peoples = new ArrayList<Integer>();
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(1);
		peoples.add(2);

		Double average = peoples.stream().mapToInt(people -> people).average().getAsDouble();
		Integer sum = peoples.stream().mapToInt(people -> people).sum();
		Long count = peoples.stream().mapToInt(people -> people).count();
		Integer min = peoples.stream().mapToInt(people -> people).min().getAsInt();
		Integer max = peoples.stream().mapToInt(people -> people).max().getAsInt();
		System.out.println("sum : " + sum);
		System.out.println("Average : "+ average);
		System.out.println("Count : "+ count);
		System.out.println("Min : "+ min);
		System.out.println("Max : "+ max);
		
		System.out.println("Items:");
		peoples.stream().map(people -> people + 1).forEach(System.out::print);
		
		
		
		String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
		Stream<String> myStream = Arrays.stream(myArray);
		Stream<String> myNewStream = 
	             myStream.map(s -> s.toUpperCase());
		String[] myNewArray =
	             myNewStream.toArray(String[]::new);
		
		
		
		
		
	}

}
