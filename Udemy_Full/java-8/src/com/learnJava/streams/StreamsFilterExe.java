package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFilterExe {

	// printed only female values
	public static List<Student> filterExample(){
		List<Student> genderFilter = StudentDataBase.getAllStudents().stream()
				.filter(stu->stu.getGender().equals("female")).collect(Collectors.toList());
		return genderFilter;
	}

	// who is the gpa gretethen 3.9
	
	public static List<Student> studentGpa() {
		
List<Student> stuGpa = StudentDataBase.getAllStudents().stream().filter(j->j.getGpa()>=3.9).collect(Collectors.toList());
		return stuGpa;
	}

	//printed only male values

	public static List<Student> filterMaleValues(){

		List<Student> filterMaleExe = StudentDataBase.getAllStudents().stream()
				.filter(k->k.getGradeLevel()>=3.9)
				.filter(j->j.getGender().equals("male")).collect(Collectors.toList());
		return filterMaleExe;
	}
	public static void main(String[] args) {
		StreamsFilterExe.filterExample().forEach(System.out::println);
		System.out.println();
		System.out.println("Male values");
		StreamsFilterExe.filterMaleValues().forEach(System.out::println);
		System.out.println();
		System.out.println("Studnt Gpa ");
		StreamsFilterExe.studentGpa().forEach(System.out::println);
  	}

}
