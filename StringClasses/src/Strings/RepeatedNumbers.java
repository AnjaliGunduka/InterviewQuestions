package Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedNumbers {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 2, 4, 5, 4 };
		int[] array = Arrays.stream(input).boxed()
			//	Collectors.groupingBy method to group the integers by their values and count their occurrences. This gives us a map where the keys are the integers and the values are their counts.
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()))
			//	We then convert the map entries to a stream 
			//	using entrySet method, filter out the entries with
//				count less than or equal to 1 using filter method, 
//				and map the resulting entries back to their keys using mapToInt method
				.entrySet().stream().filter(e -> e.getValue() > 1).mapToInt(Map.Entry::getKey).toArray();

		System.out.println(Arrays.toString(array));
	}

}
