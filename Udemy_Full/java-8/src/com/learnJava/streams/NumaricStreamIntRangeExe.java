package com.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumaricStreamIntRangeExe {

	public static void main(String[] args) {

		IntStream.range(1, 10).forEach((val->System.out.println(val)));

		// same exe return type
		
		IntStream type = IntStream.range(1, 15);
		System.out.println();
		System.out.println("with type exe " + type.count());
		
		// RangeClosed method will show difference here lets see exe
		
       IntStream intRange = IntStream.rangeClosed(1, 10);
		System.out.println( "RangeCloseExe " + intRange.count()); // here is print the complite the 1 to 10
	
		IntStream.rangeClosed(1, 10).forEach(v->System.out.println( "Range Exe  " + v));
		
		//LongStream exe here
		System.out.println();

	LongStream longExe = LongStream.range(10, 20);
	System.out.println("longStream exe " + longExe.count());	
	
	//with lambda function sample exe using LongRangeClosed
	System.out.println();
	LongStream.rangeClosed(10, 20).forEach(j->System.out.println("RangeClosed with lambda " + j));
		/*
		 * Note :- Basically double stream is not suport the java rangeclosed but if you want get like same 
		 * double stream type how can u do there is one way to achive that asDoubleStream() method is there 
		 */	
	System.out.println();
	IntStream.rangeClosed(20, 30).asDoubleStream().forEach(j->System.out.println("asDoubleStream exe " + j));
	System.out.println();
	IntStream.rangeClosed(30, 40).asLongStream().forEach(d->System.out.println("asLongStream exe" + d) );
	
	
	
	
	
	
	
	}
	

}