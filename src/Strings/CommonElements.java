package Strings;

import java.util.Arrays;

public class CommonElements {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		int[] array1 = { 1, 3, 4, 66 };
		int[] array2 = Arrays.stream(array).filter(e -> Arrays.stream(array1).anyMatch(e1 -> e == e1)).distinct()
				.toArray();
		System.out.println(Arrays.toString(array2));
		int[] array3 = Arrays.stream(array).filter(e -> Arrays.stream(array1).noneMatch(e1 -> e == e1)).distinct()
				.toArray();
		System.out.println(Arrays.toString(array3));
		int[] array5 = Arrays.stream(array).filter(e -> Arrays.stream(array1).allMatch(e1 -> e == e1)).distinct()
				.toArray();
		System.out.println(Arrays.toString(array5));

	}

}
