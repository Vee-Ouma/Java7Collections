package edu.adias.java7.collection;

public class CacheShirt {
	
	private Shirt shirt;
	
	public void add(Shirt shirt){
		this.shirt = shirt;
	}
	
	public Shirt get(){
		return this.shirt;
	}

}
