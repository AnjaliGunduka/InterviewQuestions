package Strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwapTwoNumbers {
	   public static void main(String args[]) {

		  int x=8;
		  int y=9;
		  
		   x=x+y;
		   y=x-y;
		   x=x-y;
		   System.out.println(x);
		   System.out.println(y);
		   
		   
		   
		   String s="AbvgAGJ";
		   String collect = Stream.of(s).map(x1-> new StringBuilder(s)
				   .reverse()).collect(Collectors.joining(""));
		   System.out.println(collect);
		  
		   
	   }
}
