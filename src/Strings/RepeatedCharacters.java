package Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedCharacters {
	public static void main(String[] args) {

		String s = "anjalii";
		Set<Character> allChars = new HashSet<>();
		// empty HashSet called allChars to store all the characters we encounter in the
		// input string
		Set<Character> c1 = s.chars().mapToObj(c -> (char) c)
				// We filter the characters to keep only those that are already present in the
				// allChars set, i.e., those that have already been encountered before in the
				// input string. We use the add method of the HashSet to add each character to
				// the set as we encounter it. The add method returns true if the element was
				// added to the set (i.e., it was not already present),
				// and false otherwise
				.filter(c -> !allChars.add(c))
				// the filter keeps only those characters for which add returns false, i.e.,
				// those that are repeated in the input string.
				.collect(Collectors.toSet());
		System.out.println(c1);

	}

}
