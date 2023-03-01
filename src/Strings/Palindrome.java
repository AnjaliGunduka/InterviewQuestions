package Strings;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {

		String s = "Madam";
		String tmp = s.replaceAll("\\s+", "");
		boolean noneMatch = IntStream.range(0, tmp.length() / 2)
				.noneMatch(i -> tmp.charAt(i) != tmp.charAt(tmp.length() - i - 1));

		System.out.println(noneMatch);
		// without stream
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		if (s.equalsIgnoreCase(s2)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// Using integer
		int n = 1;
		int sum = 0, r, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("yes");
		else
			System.out.println("no");
		
		String a1,a2="";
		Scanner sc=new Scanner(System.in);
		
		a1=sc.nextLine();
		int length = a2.length();
		for(int i=length-1;i>=0;i--)
		{
			a1=a1+a2.charAt(i);
		}
		if (a1.equals(a2))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");  
		
		
		
		
	}

}
