package com.javaclass.week1;

public class ConstructorOverloading {
	
	public static void main(String[] args) {
		ConstructorOverloading constructorOverloading = new ConstructorOverloading();
		ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(1, 2);
		ConstructorOverloading constructorOverloading3 = new ConstructorOverloading(1, 2, 3);
		
		constructorOverloading.display("Hello world from first object");
		constructorOverloading2.display("Hello world from second object");
		constructorOverloading3.display("Hello world from third object");
		
	}
	
	public ConstructorOverloading() {}
	
	public ConstructorOverloading(int a, int b) {}
	
	public ConstructorOverloading(int a, int b, int c) {}
	
	public void display(String message) {
		System.out.println(message);
	}

}
