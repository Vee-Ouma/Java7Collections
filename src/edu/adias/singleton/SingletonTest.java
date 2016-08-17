package edu.adias.singleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.adias.java7.test.Address;
import edu.adias.java7.test.Student;

public class SingletonTest {
	
	public static void main(String[] args){
		
		Student s = Student.getStudentInstance();
		
		s.setName("Ram");
		s.setDob(new Date());
		s.setId("1001");
		
		List<Address> addressList = new ArrayList<>();
		
		Address a1 = new Address();
		a1.setDoorNO("101");
		a1.setCity("Bangalore");
		
		addressList.add(a1);
		
		Address a2 = new Address();
		a2.setDoorNO("102");
		a2.setCity("Bangalore");
		addressList.add(a2);
		
		
		s.setAddressList(addressList);
		
		
		
		System.out.println("s-->\t"+s);
		
		
		
	}

}
