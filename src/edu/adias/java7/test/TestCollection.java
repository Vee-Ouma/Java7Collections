package edu.adias.java7.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {
		
		//create a list
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("Green apple");
		System.out.println("Before");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("After");
		Collections.sort(list);
		
		for (String s : list) {
			System.out.println(s);
		}
		
		
		List<Student> listStudent = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setId("ID100");
		s1.setName("Name1");
		s1.setDob(new Date());
		s1.setAddress("ADDRESS");
		
		listStudent.add(s1);
		
		Student s2 = new Student();
		s2.setId("ID100");
		s2.setName("Name1");
		s2.setDob(new Date());
		s2.setAddress("ADDRESS");
		listStudent.add(s2);
		
		for (Student student : listStudent) {
			System.out.println(student);
			
		}
		
		Set<String> setStudent = new TreeSet<>();
		
		setStudent.add("apple");
		setStudent.add("orange");
		setStudent.add("apple");
		
		for (String string : setStudent) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
	}

}
