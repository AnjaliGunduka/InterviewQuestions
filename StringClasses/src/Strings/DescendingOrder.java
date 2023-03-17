package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {

	public static void main(String[] args)
	{
		int[] numArr = new int[]{1,5,3,4,5};
		
	int[] a=	Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder())
		.mapToInt(Integer::intValue).toArray();
	System.out.println(Arrays.toString(a));
	}
}
