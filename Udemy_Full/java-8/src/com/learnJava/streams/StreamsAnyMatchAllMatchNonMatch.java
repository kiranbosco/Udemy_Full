package com.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsAnyMatchAllMatchNonMatch {

	/*
	 * this is the allMatcher its take the input as an and return the output boolean
	 * value it is consist the predicate and take input and return boolean output response
	 */
	public static boolean allMatcherExe() {

		return StudentDataBase.getAllStudents().stream().allMatch(stu->stu.getGpa()>=3.5);
	}
	/* in this method if any stream data has match it will be return true 
	 * or else it will be return false alreday Adam is there in the database
	 *  if you want check any outher name exe:-  kiran is not there in the database u can check use kiran name here it will be return  false
	 * */
	public static boolean anyMatcherExe() {
		return StudentDataBase.getAllStudents().stream().anyMatch(stu->stu.getName().equals("Adam"));
	}

	public static boolean nonMatcherExe() {
		return StudentDataBase.getAllStudents().stream().noneMatch(stu->stu.getGender().equals("thirdGender"));
	}
	public static void main(String[] args) {
		System.out.println("AllMatcherExe Response : " + allMatcherExe());
		System.out.println();
		System.out.println( " anyMatcherExe Response :  " +anyMatcherExe());
		System.out.println();
		System.out.println("nonMatcherExe Response  : " + nonMatcherExe());

	}

}
