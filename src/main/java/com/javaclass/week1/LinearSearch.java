package com.javaclass.week1;

public class LinearSearch {

	public static void main(String[] args) {
		int[] searchData = { 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		int result = 45;
		int first = 0;
		
		for (int i = 0; i < searchData.length; i++) {
			int j = searchData[i];
			if(j == result) {
				System.out.printf("Result found on index %d \n", i);
				break;
			}
		}
		
	}
}
