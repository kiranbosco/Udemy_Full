package com.streams;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapExample {

	/*
	 * map:- it will use the conver the one type to another type in streams api and
	 * also we have to perform some operation also
	 */
	public static List<String> nameList(){
		List<String> names = StudentDataBase.getAllStudents().stream().map(Student ::getName)
				.map(String::toUpperCase).collect(Collectors.toList());
		return names;
	}
	// Set method
	public static Set<String> uniqueValues(){

		Set<String> studentList = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toSet());
		return studentList;
	}
	public static void main(String[] args) {
		System.out.println(nameList());
		StreamMapExample.uniqueValues();

	}

}
