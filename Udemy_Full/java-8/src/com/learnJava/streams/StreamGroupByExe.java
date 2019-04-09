package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamGroupByExe {

	public static void groupByExe() {

		List<Student>	list= StudentDataBase.getAllStudents().stream().collect(Collectors.toList());
		list.forEach(System.out::println);
	}
	public static void main(String[] args) {

		groupByExe();
	}

}
