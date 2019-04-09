package com.streams;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class JoiningStreamsExe {
	// this is example 1 to return all the student concatinations
	public static String joining_1() {

		return StudentDataBase.getAllStudents().stream().map(Student ::getName).collect(Collectors.joining());
	}
	// exe 2 using delimitar("_")
	public static String joining_2() {

		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.joining("-"));
	}

	// exe 3 using prefix postfix(prefix , postfix)
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining("_", "{", "}"));
	}
	public static void main(String[] args) {

		System.out.println( " joining_1" + joining_1());
		System.out.println();
		System.out.println("joining_2" + joining_2());
		System.out.println();
		System.out.println( "joining_2 " + joining_3());
	}

}
