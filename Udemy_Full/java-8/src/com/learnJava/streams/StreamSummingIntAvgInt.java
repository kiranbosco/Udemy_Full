package com.streams;

import java.util.OptionalDouble;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamSummingIntAvgInt {

	public static long sumExe() {

		return StudentDataBase.getAllStudents()
				.stream().mapToInt(Student::getNoteBooks).sum();
	}
		public static OptionalDouble avgExe() {
		return StudentDataBase.getAllStudents()
				.stream().mapToInt(Student::getNoteBooks).average();
	}

		public static void main(String[] args) {
			System.out.println("sumExe " + sumExe());
			System.out.println("avgExe " + avgExe());


		}
	}
