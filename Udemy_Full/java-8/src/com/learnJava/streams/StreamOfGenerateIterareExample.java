package com.streams;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfGenerateIterareExample {

	public static void main(String[] args) {

		// this stream.of() will be create the certain values passed
		Stream<String> streamExe = Stream.of("kiran","Heemaja","charan");
		streamExe.forEach(System.out::println);

		//iterate this iterate method will be generate infiniti values
		
		Stream.iterate(1, x->x*2)
		.limit(5)
		.forEach(System.out::println);
		

		//  generate() this method will be  create the infiniti stream
		
		Supplier<Integer> infinitiStream = new Random()::nextInt;
	Stream.generate(infinitiStream).limit(5).forEach(System.out::println);
	
	// generate the random class in java8
	
	Random ran = new Random();
	 int ranExe = ran.nextInt(10);
	 System.out.println(ranExe);
	 
	}
}
