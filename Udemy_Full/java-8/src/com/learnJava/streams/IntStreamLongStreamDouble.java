package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamLongStreamDouble {

	// count the list of data in streams supose if you want calculate the list of emp salary u can fallow like this
	public static int sumOfNumber(	List<Integer> list) {
		return list.stream().reduce(0, (x,y)->x+y);
	}

	// another approch here same exe
	
	public static int sumOfNumberUseIntStream () {
		
	return IntStream.rangeClosed(1, 6) // here is the count the from 1 to 6 number sum
	.sum();
	}
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);	
		System.out.println(sumOfNumber(list));
		
		System.out.println(" second Approch " + sumOfNumberUseIntStream());

	}

}

