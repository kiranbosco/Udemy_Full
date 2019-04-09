package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsReducedExample {
	/*
	 * 
	 * Java 8 Stream reduce method example. The Stream.reduce() method is a
	 * reduction operation. A reduction operation takes a sequence of input elements
	 * and combines them into a single summary result by repeated application of a
	 * combining operation public static int
	 * performMiltiplicationExample(List<Integer>listofStreams) {
	 */
	//1
	//3
	//5
	//7
	/*
	 * a=1 , b=1(from stream)=>result is 1 returned;
	 *  a=1 =b=3 (from stream)=>result
	 * is 3 returned; a=3 =b=5(from stream)=> result is 15 returned; 
	 * a =15 b=7(from stream)=> result is107 returned;+
	 * 
	 */
	public static int performMiltiplicationExample(List<Integer> listofStreams) {
		return listofStreams.stream().reduce(1, (a,b)->a*b);
	}

	public static Optional multiplicationWithOutIdentity(List<Integer> withoutIdentity) {

		return withoutIdentity.stream().reduce( (a,b)->a*b);
	}
	public static int performSumOperation(List<Integer> sumOperation) {

		return sumOperation.stream().reduce(0,(a,b)->a+b);
	}
	public static int devidedByOperation(List<Integer> divOpe) {

		return divOpe.stream().reduce(2, (a,b)->a/b);

	}
	public static int subOperation(List<Integer> subOpe) {
		return subOpe.stream().reduce(1, (a,b)->a-b);

	}

	// check the which student has the highest gpa values consist in student database

	public static Optional<Student> getHighestGpaValues(){
		return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->{
			if(s1.getGpa()>s2.getGpa()) {
				return s1;
			}
			else {
				return	s2;
			}
		});

	}

	/*
	 * same logic more readable less consist code here but same response
	 * */

	public static Optional<Student> highestGpaValues(){

		return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->s1.getGpa()>s2.getGpa() ? s1 :s2);


	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,3,5,7);
		List<Integer> ints = new ArrayList<Integer>();
		System.out.println(performMiltiplicationExample(integers));
		System.out.println(performSumOperation(integers));
		System.out.println(subOperation(integers));
		System.out.println(devidedByOperation(integers));

		Optional <Integer> result1 = multiplicationWithOutIdentity(ints);
		System.out.println(result1.isPresent());

		Optional<Student> studentOpetional = getHighestGpaValues();
		if(getHighestGpaValues().isPresent()) {
			System.out.println(studentOpetional.get());

			Optional<Student> stuOpitional = highestGpaValues();
			if(highestGpaValues().isPresent()) {
				System.out.println(stuOpitional.get());
			}
		}


	}

}
