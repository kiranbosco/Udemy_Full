package com.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FlatMapperExample {

	public static List<String> studentActivities(){

		List<String >studentList = StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
		return studentList;
	}

	public void studentNameGrade() {

		Map<String, Integer >students = StudentDataBase.getAllStudents().stream().collect(Collectors.toMap(Student::getName, Student::getGradeLevel));
		System.out.println(students);	}


	public static void main(String[] args) {

		System.out.println(studentActivities());
		FlatMapperExample mapper = new FlatMapperExample();
		mapper.studentNameGrade();
	}

}
