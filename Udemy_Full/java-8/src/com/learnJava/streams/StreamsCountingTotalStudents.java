package com.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsCountingTotalStudents {

	public static long countingTotal() {

		return StudentDataBase.getAllStudents().stream()
				.filter(stu->stu.getGpa()>=3.9)
				.filter(stu->stu.getGender().equals("male"))
				.count();
	}

	public static void main(String[] args) {
		System.out.println("System.out.println " + countingTotal());

	}

}
