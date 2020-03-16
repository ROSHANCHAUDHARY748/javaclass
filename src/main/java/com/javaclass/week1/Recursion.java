package com.javaclass.week1;

public class Recursion {

	private static int count = 0;

	public static void counter() {
		count++;
		if (count <= 5) {
			System.out.println("Displaying " + count);
			counter();
		}
	}

	public static void main(String[] args) {
		counter();
	}
}