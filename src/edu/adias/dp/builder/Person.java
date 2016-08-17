package edu.adias.dp.builder;

public class Person {

	private final String lastName;
	private final String firstName;
	private final String middleName;
	private final String salutation;
	private final String suffix;
	private final String streetAddress;
	private final String city;
	private final String state;
	private final boolean isFemale;
	private final boolean isEmployed;
	private final boolean isHomewOwner;
	
	public Person(
			final String lastName,
			final String firstName,
			final String middleName,
			final String salutation,
			final String suffix,
			final String streetAddress,
			final String city,
			final String state,
			final boolean isFemale,
			final boolean isEmployed,
			final boolean isHomewOwner) {
		
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.salutation = salutation;
		this.suffix = suffix;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.isFemale = isFemale;
		this.isEmployed = isEmployed;
		this.isHomewOwner = isHomewOwner;
	}
	

}
