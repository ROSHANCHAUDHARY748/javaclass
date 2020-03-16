package com.javaclass.week1;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.sum(1, 2);
		methodOverloading.sum(1, 2, 3);
		methodOverloading.sum(1, 2, 3, 4);
		
	}
	
	public void sum(int a, int b) {
		System.out.printf("Method with two params %d, %d\n", a, b);
	}
	
	public void sum(int a, int  b, int c) {
		System.out.printf("Method with three params %d, %d and %d\n", a, b, c);
	}

	public void sum(int a, int b, int c, int d) {
		System.out.printf("Method with four params %d, %d, %d and %d\n", a, b, c, d);
	}
}
