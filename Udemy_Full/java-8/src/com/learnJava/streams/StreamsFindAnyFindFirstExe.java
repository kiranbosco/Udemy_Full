package com.streams;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFindAnyFindFirstExe {

	/*if here is match any criteria then it will be return outherWise it will be retrun error message*/
	public static Optional<Student> findAnytMethod(){
		return StudentDataBase.getAllStudents().stream().filter(j->j.getGpa()>=3.1).findAny();

	}
	
	//findAnyMethod
	
	public static Optional<Student> findFirstMethod(){
		
	return	StudentDataBase.getAllStudents().stream().filter(stu->stu.getGpa()>=4.1).findFirst();
	}
	public static void main(String[] args) {

		Optional<Student> find = findAnytMethod();		
		if(find.isPresent()) {
			System.out.println(find.get());

		}
		else {
			System.out.println("Sorry i could not Found ur Response");
		}
		System.out.println();
		
		Optional<Student> findExe = findFirstMethod();
		if(findExe.isPresent()) {
			System.out.println(findExe.get());
		}
		else {
			System.out.println("Sorry");
		}
	}

}
