package dataStructure.comparablesAndComparators.comparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(405,"Bob"));
		students.add(new Student(405,"Awanish"));
		students.add(new Student(78,"Manish"));
		students.add(new Student(98,"Anuj"));
		students.add(new Student(96,"Pankaj"));
		
		Collections.sort(students);
		
		students.forEach(System.out::println);
		
		
		

	}

}
