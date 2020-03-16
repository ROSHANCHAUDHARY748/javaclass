package com.javaclass.week1;

/**
 * You cannot initialize / create object of an abstract class.
 * It can have both abstract and non abstract method
 * It can have final method which will not allow child class to override or change the method
 *
 */
public abstract class AbstractClassExample {
	
	public void dance() {
		System.out.println("I am dancing");
	}
	
	abstract void implementedByChild();

}
