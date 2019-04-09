package com.streams;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SortedByStudentNames {

	//sorted By names
	public static List<Student> sortedStudentNames(){
		List<Student>   values=	StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		return values;	
	}
	// sorted GPA
	public static List<Student> sortedGpa(){
		List<Student>listOfGPA =	StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
		return listOfGPA;
	}
	// if you want get the First Highest value of GPA

	public static List<Student> highestGpaVal(){
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa)
						.reversed()).collect(Collectors.toList());
	}

	//sorted by gradeLevel

	public static List<Student> sortebByGradelevel(){
		return StudentDataBase.getAllStudents()
				.stream().sorted(Comparator.comparing(Student::getGender))
				.collect(Collectors.toList());
	}

	//student Activities

	public static List<String> studentActivities(){
		return 	StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream).collect(Collectors.toList());

	}
	public static void main(String[] args) {
		SortedByStudentNames.sortedStudentNames().forEach(System.out::println);
		System.out.println();
		SortedByStudentNames.sortedGpa().forEach(System.out::println);
		System.out.println();
		SortedByStudentNames.sortebByGradelevel().forEach(System.out::println);
		System.out.println();
		System.out.println("Highest Values of GPA");
		SortedByStudentNames.highestGpaVal().forEach(System.out::println);
		System.out.println();
		System.out.println("Activities ");
		SortedByStudentNames.studentActivities().forEach(System.out::println);

	}

}
