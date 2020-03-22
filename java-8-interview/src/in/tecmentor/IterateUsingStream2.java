package in.tecmentor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IterateUsingStream2 {

	public static void main(String[] args) {
		String[] array = { "t", "e", "c", "m", "e", "n", "t", "o", "r" };
		List<String> arrayList = Arrays.asList(array);
		IntStream.range(0, arrayList.size())
				.mapToObj(index -> String.format("Index- %d, Value- %s",
						index, arrayList.get(index))).forEach(System.out::println);
	}
}
