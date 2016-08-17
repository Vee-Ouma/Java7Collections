package edu.adias.java7.collection.compare;

import java.util.Comparator;

public class StudentNameSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		int result = s1.getName().compareTo(s2.getName());
		if(result > 0) return 1;
		if(result < 0) return -1;
		return 0;
	}

}
