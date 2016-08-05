package edu.adias.java7.test;

import edu.adias.java7.collection.CacheShirt;
import edu.adias.java7.collection.CacheString;
import edu.adias.java7.collection.Shirt;

public class Test {

	public static void main(String[] args) {
		CacheString cs = new CacheString();
		
		cs.add("my new message");
		
		System.out.println(cs.get());
		
		CacheShirt cShirt = new CacheShirt();
		
		Shirt shirt = new Shirt("RED", "M");
		
		cShirt.add(shirt);
		
		System.out.println(cShirt.get());
		
		
		
		
	}

}
