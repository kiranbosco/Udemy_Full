package com.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AgrigateFunctions {
	
	public static void main(String[] args) {
	int	range = IntStream.rangeClosed(1, 10).sum(); // using sum method
	System.out.println(range);
	
	//exe :-  max value
	
	OptionalInt intmax = IntStream.rangeClosed(1, 10).max();
	System.out.println(intmax.isPresent());
	System.out.println("max " + intmax);
	// minVal
	OptionalInt minInt = IntStream.rangeClosed(1, 20).min();
	System.out.println(minInt.isPresent());
	System.out.println( "min " +minInt);
	
	// average val
	
	OptionalDouble ave = IntStream.rangeClosed(30, 50).average();
	System.out.println ( "averege" + ave );
	System.out.println(ave.isPresent());
	
	
	}

}
