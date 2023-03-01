package Strings;

public class Nonrepeatedcharacter {

	public static void main(String[] args) {
		
		
		String s="puiugiuh";
		
		
		Character orElseThrow = s.chars().mapToObj(c->(char)c).
				filter(c->s.indexOf(c)==s.lastIndexOf(c))
		.findFirst().orElseThrow();
		System.out.println(orElseThrow);
		Character orElseThrows = s.chars().mapToObj(c->(char)c).
				filter(c->s.indexOf(c)!=s.lastIndexOf(c))
		.findAny().orElseThrow();
		System.out.println(orElseThrows);
		
		
	}
}
