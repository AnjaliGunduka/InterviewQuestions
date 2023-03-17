package Strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Anjali";
		String collect = Stream.of(s).map(ss -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect);

	}

}
