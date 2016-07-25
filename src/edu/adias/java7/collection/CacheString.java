package edu.adias.java7.collection;

public class CacheString {
	
	private String message;
	
	public void add(String message){
		this.message = message;
	}

	public String get(){
		return this.message;
	}
}
