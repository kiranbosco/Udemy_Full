package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.swing.ListModel;

public class ReduceMinAndMaxValue {

	public static int findMaxValue(List<Integer> list) {

		/* 6 -> y
		 * 7 -> y
		 * 8 -> y
		 * 9 -> y
		 * 10-> y
		 * 
		 * X value hold the max value and comparing with  y and final value will be retrive here
		 * 
		 * Here is the one DisAdvance if ur passing empty list it will be returnn  zero max value
		 * that is not perfect to make coding  we having another approch thata is OpitionalClass
		 * 
		 * */
		return list.stream().reduce(0, (x,y)-> x>y ? x:y);
	}


	public static Integer listOfMin (List<Integer> minValue){

		return minValue.stream().reduce(0, (x,y)->x<y ? x :y);

	}

	// when you calculate the max value in ur code it always use the Opitional class it will be avoid the null pointer exceptionn also

	public static Optional<Integer> findOptionalMaxValue (List<Integer> findOpetional){
		return findOpetional.stream().reduce((x,y)->x>y ? x:y);

	}

	public static Optional<Integer> opitionalMinValue(List<Integer> listOfOpitionalMin) {

		return listOfOpitionalMin.stream().reduce((x,y)-> x<y ? x :y);

	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(6,7,8,9,10);
		//	List<Integer> list = new ArrayList<Integer>();
		int listofValues =  findMaxValue(list);
		System.out.println(listofValues);
		Optional <Integer> listOfOpitional = findOptionalMaxValue(list);
		if(listOfOpitional.isPresent()) {
			System.out.println("Opitional Max" + listOfOpitional.get());
		}
		else {
			System.out.println("Sorry there is not find any max values");

			int listOfMin =listOfMin(list);
			System.out.println(" with out opitional class Min value " +  listOfMin);

			Optional <Integer> min = opitionalMinValue(list);
			if(min.isPresent()) {
				System.out.println(min.get());
			}
			else {
				System.out.println( "Sorry there is not find any min values");
			}
		}
	}

}
