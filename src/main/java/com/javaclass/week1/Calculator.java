package com.javaclass.week1;

public class Calculator {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.add(1,2);
		calculator.subtract(4,3);
		calculator.multiply(2, 3);
		calculator.divide(4, 2);
		
	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.printf("Suf of %d and %d is %d \n", a, b, result);
	}
	
	public void subtract(int a, int b) {
		int result = a - b;
		System.out.printf("Diffrence between %d and %d is %d\n", a, b, result);
	}
	
	public void multiply(int a, int b) {
		int result = a * b;
		System.out.printf("Multiplication of %d and %d is %d\n",a, b, result);
	}
	
	public void divide(int a, int b) {
		float result = a / b;
		System.out.printf("Division of %d by %d is %f \n", a, b, result);
	}
	

}
