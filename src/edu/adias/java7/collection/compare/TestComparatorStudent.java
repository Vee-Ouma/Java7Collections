package edu.adias.java7.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class TestComparatorStudent {
	
	public static void main(String[] args){
		
		Student s1 = new  Student("Saida", 100, 7.333);
		Student s2 = new Student("Rashika", 101, 8.999);
		Student s3 = new Student("Advaith", 102, 9.89);
		Student s4 = new Student("Reyansh", 104, 9.99);
		
		StudentNameSort sortByName = new StudentNameSort();
		StudentGpaSort sortByGpa = new StudentGpaSort();
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		System.out.println("Student List:"+studentList);
		
		Collections.sort(studentList, sortByName);
		
		System.out.println("Student List Sorted By Name:"+studentList);
		
		Collections.sort(studentList, sortByGpa);
		
		System.out.println("Student List Sorted By gpa:"+studentList);
		
		
		Set<Student> studentSet = new TreeSet<>(sortByName);
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		
		System.out.println("Student Set:"+studentSet);
		
	}

}
