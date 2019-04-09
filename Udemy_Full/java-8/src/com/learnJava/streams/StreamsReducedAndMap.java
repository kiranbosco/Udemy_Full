package com.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsReducedAndMap {

	public static Integer studentsNoteBookCount() {

		return StudentDataBase.getAllStudents().stream()
				.filter(stu->stu.getGradeLevel()>=3)
				.filter(stu->stu.getGender().equals("female"))
				.map(Student::getNoteBooks).reduce(0 ,(a,b)->a+b);
	}

	// same code write the using count method()

	public static int studentBooks() {

		int	books	= StudentDataBase.getAllStudents().stream()
				.filter(sts->sts.getGradeLevel()>=3.9)
				.filter(sts->sts.getGender().equals("female"))
				.map(Student::getNoteBooks).reduce(0, Integer::sum);
		return books;
	}
	public static void main(String[] args) {

		System.out.println(studentsNoteBookCount());
		System.out.println(studentBooks());

	}

}
