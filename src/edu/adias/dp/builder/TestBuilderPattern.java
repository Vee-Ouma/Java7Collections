package edu.adias.dp.builder;

public class TestBuilderPattern {
	public static void main(String[] args){
		
		User user = new User.UserBuilder("saida", "dhanavath")
				.age(30)
				.build();
		
		
	}
}
