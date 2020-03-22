package in.tecmentor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class IterateUsingStream {

	public static void main(String[] args) {
		String[] array = { "t", "e", "c", "m", "e", "n", "t", "o", "r" };
		List<String> arrayList = Arrays.asList(array);
		AtomicInteger integer = new AtomicInteger();
		arrayList.stream().map(s -> "Index- " + integer.getAndIncrement() 
				+ ", Value- " + s).forEach(System.out::println);
	}
}
