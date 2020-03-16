package com.javaclass.week1;

import java.util.Scanner;

public class Plaindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check for palindrome");
		int value = scanner.nextInt();
		
		int remainder = 0;
		int temp = value;
		int result = 0;
		
		while(value > 0) {
			remainder = value % 10;  //(value modulus 10)
			result = result * 10 + remainder;
			value = value / 10;
		}
		
		if(result == temp) {
			System.out.printf("Your entered value %d is plaindrome.\n", temp);
		}else {
			System.out.printf("Your entered value %d is not palindrome\n",temp);
		}
		
		scanner.close();
		
	}

}
