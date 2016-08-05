package edu.adias.java7.collection;

public class CacheTest {

	public static void main(String[] args) {
		
		CacheString cacheString =new CacheString(); //Type
		CacheShirt cacheShirt =new CacheShirt(); //Type
		

		//Generics
		CacheAny<String> myGenericMessage =  new CacheAny<String>();
		CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();
		
		cacheString.add("new Message"); //Type
		myGenericMessage.add("new message"); // Generic
		
	}
}
