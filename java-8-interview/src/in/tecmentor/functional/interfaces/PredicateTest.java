package in.tecmentor.functional.interfaces;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		System.out.println();
		
		Predicate<Integer> lesserthan = (i) -> (i<18);
		System.out.println(lesserthan.test(10));
		 
	}

}
