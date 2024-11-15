package com.advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudentNames {

	public static void main(String[] args) {
		List<String> studentNames = Arrays.asList("Alice", "Bob", "Angela", "David", "Aaron", "Bella"); 
		List<String> filteredNames = studentNames.stream() 
				.filter(name -> name.startsWith("A")) 
				.collect(Collectors.toList()); 
		System.out.println("Students whose names start with 'A': " + filteredNames);

	}
}
