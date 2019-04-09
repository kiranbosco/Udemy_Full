package com.streams;

import java.util.Comparator;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMinByMamBy {

	// this is always retrun Optional minBy method

	public static Optional<Student> minByExample(){
		return StudentDataBase.getAllStudents()
				.stream().min(Comparator.comparing(Student::getGpa));
	}

	// max by gradeLevel
	public static Optional<Student> maxByExe (){

		return StudentDataBase.getAllStudents().stream().max(Comparator.comparing(Student::getGradeLevel));
	}
	public static void main(String[] args) {
		System.out.println("minByExample" + minByExample());
		System.out.println("maxByExe " + maxByExe());

	}
}
