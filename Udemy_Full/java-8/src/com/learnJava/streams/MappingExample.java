package com.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class MappingExample {


	public static void main(String[] args) {

		// getting all list of streams data 
		List<String> list = StudentDataBase.
				getAllStudents()
				.stream().map(Student::getName)
				.collect(Collectors.toList());
		System.out.println("StudentDataBase data " + list);
		
		System.out.println();
		// but i need only unique values how do i
		
		// because here is not repeat any name twise 
		Set<String> set = StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.toSet());
		System.out.println("StudentDataBase Unique" + set);
	}

}
