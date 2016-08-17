package edu.adias.play;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestAny {

	public static void main(String[] args) {
		
		TestAny test = new TestAny();
		
		List<Person> people = test. getPeople();
		
		List<String> list = people.stream().map(Person::getFirstName).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> ageList = people.stream().map(Person::getAge).collect(Collectors.toList());
		System.out.println(ageList);

	     // Accumulate firstNames into a TreeSet
	     Set<String> set = people.stream().map(Person::getFirstName).collect(Collectors.toCollection(TreeSet::new));

	     System.out.println(set);

	}
	
	private List<Person> getPeople(){
		List<Person>  people = new ArrayList<>();
		for(int i=1; i<=10; i++){
			people.add(new Person("firstName"+i,"lastName"+i,i));
		}
		
		return people;
		
	}
	
 class Person {
		
		private String firstName;
		private String lastName;
		private int age;
		
		
		
		public Person(String firstName, String lastName, int age) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}

}
