package Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountWords {

	public static void main(String[] args)
	{
		String s="anjai ljlh";
		Stream<String> stream = Arrays.stream(s.split(" "));
		long count = stream.count();
		System.out.println(count);
		
	}
}
