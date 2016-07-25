package edu.adias.java7.collection;

public class CacheTest {

	public static void main(String[] args) {
		
		CacheString cacheString =new CacheString();
		cacheString.add("Message");
		System.out.println("CacheString:"+cacheString.get());
		
		CacheShirt cacheShirt =new CacheShirt();
		Shirt shirt = new Shirt("RED", "Medium");
		cacheShirt.add(shirt);
		System.out.println("CacheShirt:"+cacheShirt.get());
		
		CacheAny cacheAny =  new CacheAny<>();
		cacheAny.add(shirt);
		System.out.println("CacheAny:"+cacheAny.get());
		
	}

}
