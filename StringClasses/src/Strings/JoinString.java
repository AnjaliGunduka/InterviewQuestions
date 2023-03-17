package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
	
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Welcome", "to", "India");
		
		String collect = list.stream().map(String::valueOf).collect(Collectors.joining("-"));
		System.out.println(collect);
		
	}

}
