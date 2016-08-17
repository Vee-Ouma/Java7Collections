package edu.adias.java7.test;

public class Address {
	
	private String doorNO;
	private String street;
	private Integer pincode;
	private String city;
	private String state;
	private String country;
	public String getDoorNO() {
		return doorNO;
	}
	public void setDoorNO(String doorNO) {
		this.doorNO = doorNO;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [doorNO=" + doorNO + ", street=" + street
				+ ", pincode=" + pincode + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}

}
