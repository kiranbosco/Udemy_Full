package com.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
public class StreamsExe {
	// thsi is the 2nd way filtring the condition

	static Predicate<Student> studentGpa =(sts->sts.getGpa()>=3);
	public static void main(String[] args) {

		//This is 1st way to filtring the condition 
		Map<String , List<String>>	studentInfo= StudentDataBase.getAllStudents().stream()
				.filter(stu->stu.getGradeLevel()>=3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentInfo);

		System.out.println("------------------");

		Map<String, Double>info = StudentDataBase.getAllStudents().stream().filter(studentGpa).collect(Collectors.toMap(Student::getName,Student::getGpa));
		System.out.println(info);
	}

}
