package com.javaclass.week1;

public class BinarySearch {

	public static void main(String[] args) {
		int [] searchData = {10, 15, 20, 25, 30, 35, 40 ,45, 50};
		
		int result = 45;
		int first = 0;
		int last = searchData.length - 1;
		int middle = (first + last) / 2;
		System.out.printf("Middle Value is %d \n", middle);
		
		while(first <= last) {
			if(searchData[middle] < result) {
				first = middle + 1;
			}else if(searchData[middle] == result) {
				System.out.printf("Result found on index %d \n", middle);
				break;
			}else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
			System.out.printf("Next middle value is %d \n", middle);
			System.out.println("Searching Again....");
		}
		
	}
	
}
