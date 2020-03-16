package com.javaclass.week1;

public class DataTypes {
	
	public static void main(String[] args) {
		// Primitive Data Types
		/*
		 * 8 bit, default is 0 , max value is 127 min value is -128
		 */
		byte byte_data = 100;
		
		/*
		 * 16 bit, default is 0, max value is 32,767 and min value is -32,768
		 */
		short short_data = 100;
		
		/*
		 * 32 bit, default is 0, max value is 2,147,483,647 and min value is -2,147,483,648 
		 */
		int int_data = 1000;
		
		/*
		 * 64 bit, default is 0, max value is 9,223,372,036,854,775,807 and min value is -9,223,372,036,854,775,808
		 */
		long long_data = 10000L;
		
		/*
		 * 32 bit single precision used to hold fraction value. Recommended for games and programmes requiring less precision
		 */
		float float_data = 1.25f;
		
		/*
		 * 64 bit double precision used to hold fraction value. Recommended for currency, scientific works
		 */
		double double_data = 1.25;
		
		/*
		 * 1 bit, default is false. Only two values true / false
		 */
		boolean boolean_data = true;
		
		/*
		 * 16 bit unicode character, 
		 */
		char char_data = 'a';
		
		System.out.println(byte_data);
		System.out.println(short_data);
		System.out.println(int_data);
		System.out.println(long_data);
		System.out.println(float_data);
		System.out.println(double_data);
		System.out.println(boolean_data);
		System.out.println(char_data);
		
	}

}
