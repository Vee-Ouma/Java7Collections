package edu.adias.java7.test;

import java.util.List;

public class Student {
	
	private String id;
	private String name;
	private java.util.Date dob;
	private List<Address> addressList;
	
	private static Student student =null;
	
	private Student(){
		super();
	}
	
	public static synchronized Student getStudentInstance(){
		if(student == null){
			student = new Student();
		}
		return student;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getDob() {
		return dob;
	}
	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob
				+ ", address=" + addressList + "]";
	}
	
	

}
