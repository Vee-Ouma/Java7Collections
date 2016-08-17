package edu.adias.java7.collection.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class TestComparableStudent {
	
	public static void main(String[] args){
		
		ComparableStudent s1 = new  ComparableStudent("Saida", 100, 7.333);
		ComparableStudent s2 = new ComparableStudent("Rashika", 101, 8.999);
		ComparableStudent s3 = new ComparableStudent("Advaith", 102, 9.89);
		ComparableStudent s4 = new ComparableStudent("Reyansh", 104, 9.99);
		
		List<ComparableStudent> studentList = new ArrayList<>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		System.out.println("Student List:"+studentList);
		
		Set<ComparableStudent> studentSet = new TreeSet<>();
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		
		System.out.println("Student Set:"+studentSet);
		
	}

}
