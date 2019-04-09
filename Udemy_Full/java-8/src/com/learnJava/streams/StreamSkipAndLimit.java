package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.management.openmbean.OpenDataException;

public class StreamSkipAndLimit {

// limit method
	/* if you want to excute the limit of student data use this limit()
	 * */
	public static Optional<Integer> limitoperation(List<Integer> listof){

		return listof.stream().limit(2).reduce((x,y)->x+y);
	}
	
	// skip method 
	
	/*
	 * This skip method will be skipt some stream operation like if you having 10 list of stsudent data 
	 *  you dont want excute the all the students info u need to excute the from 7 -10 only then only use 
	 *  this skip()
	 *  */
	public static Optional<Integer> skipMethod(List<Integer> skipsExe){
		
		return skipsExe.stream().skip(3).reduce((x,y)->x+y);
	}
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(6,7,8,9,10);
		Optional<Integer> limitMethod = limitoperation(list);
		if(limitMethod.isPresent()) {
			System.out.println(limitMethod.get());
		}
		else {
			System.out.println("sorry");
		}
		System.out.println("------------------------------");
		
		Optional<Integer> lists = skipMethod(list);
		if(lists.isPresent()) {
			System.out.println(lists.get());
		}
		else {
			System.out.println("sorry");
		}
	}
}
