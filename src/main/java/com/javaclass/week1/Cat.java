package com.javaclass.week1;

public class Cat implements Animal {
	

	public void getLegs() {
		System.out.printf("Cat has %d legs", 4);
	}

	public void canSwim() {
		System.out.printf("Cat cannot swim");
	}

	public void canWalk() {
		System.out.println("Cat can walk");
	}

}
