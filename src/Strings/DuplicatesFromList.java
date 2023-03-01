package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesFromList {
	public static void main(String[] args) {
		Student s = new Student(534, "Anjali", 30000);
		Student s6 = new Student(534, "Anjali", 30000);
		Student s1 = new Student(531, "Neha", 50000);
		Student s2 = new Student(513, "Lalitha", 60000);
		Student s3 = new Student(531, "Nirosha", 80000);
		Student s5 = new Student(510, "Preethi", 50000);
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s6);
		list.add(s2);
		list.add(s3);
		list.add(s5);
		list.forEach(e -> {	if (s.getName().contains(s.getName())) {
				System.out.println("hi");
			}
		});

		list.stream().map(e->e.getName())
		.distinct().collect(Collectors.toList()).forEach(System.out::println);

	}
}
