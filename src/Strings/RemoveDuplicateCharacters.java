package Strings;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args)
	{
		String s="piuiuuyf";
		
	String cc=	s.chars().distinct().mapToObj(c->String.valueOf((char)c))
		.collect(Collectors.joining(""));
	System.out.println(cc);
		
	}

}
