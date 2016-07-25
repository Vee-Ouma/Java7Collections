package edu.adias.java7.collection;

public class Shirt {
	
	private String color;
	private String size;
	
	
	public Shirt(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shirt [color=" + color + ", size=" + size + "]";
	}

}
