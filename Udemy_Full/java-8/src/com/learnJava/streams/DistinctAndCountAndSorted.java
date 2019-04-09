package com.streams;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class DistinctAndCountAndSorted {

	public static List<String> studentActivities(){

		//	this  distinct method will be perform only unique value  retrive
		List<String>studentLit =	StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).sorted().collect(Collectors.toList());
		studentLit.forEach(System.out::println);
		return studentLit;
	}

	// this count method  count all the stream of collection data
	public static Long countStudentActivities() {
		Long listCount =	StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).sorted().count();
		return listCount;
	}
	// count only unique values in the activities

	public static Long countUniqueValues() {

		Long uniqueData =	StudentDataBase.getAllStudents().stream().map(Student:: getActivities).flatMap(List::stream).distinct().sorted().count();
		return uniqueData;
	}

	public static void main(String[] args) {
		System.out.println(studentActivities());
		System.out.println(countStudentActivities());
		System.out.println( "Student Activities Unique Data : " +countUniqueValues());
	}

}
