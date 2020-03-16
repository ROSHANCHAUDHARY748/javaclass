package com.javaclass.week1;

import java.util.Scanner;

public class EvenOddChecker {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		
		System.out.println("Enter integer value");
		value = scanner.nextInt();
		if(value % 2 == 0) {
			System.out.printf("Value %d is even\n", value);
		}else {
			System.out.printf("Value %d is odd\n", value);
		}
		scanner.close();
	}

}
