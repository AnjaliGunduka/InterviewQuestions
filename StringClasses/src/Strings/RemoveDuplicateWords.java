package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String orignalString = "Anjali Anjali";

		String output = Arrays.asList(orignalString.split("")).stream().distinct().collect(Collectors.joining());
//joining collector with a space delimiter to concatenate all the unique words back into a new string. We then return this new string.
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + output);

		int[] input = { 1, 2, 3, 2, 4, 5, 4 };

		int[] array = Arrays.stream(input).distinct().toArray();
		System.out.println(Arrays.toString(array));

	}

}
