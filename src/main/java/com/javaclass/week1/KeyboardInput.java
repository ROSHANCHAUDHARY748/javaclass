package com.javaclass.week1;

import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String fullName = scanner.nextLine();
		
		System.out.println("Enter your DOB");
		String dob = scanner.nextLine();
		
		System.out.println("Enter you address");
		String address = scanner.nextLine();
		
		System.out.println("Enter your phone number");
		String phoneNumber = scanner.nextLine();
		
		System.out.println("Thank you!!!");
		scanner.close();
	}

}
