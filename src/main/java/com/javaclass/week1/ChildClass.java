package com.javaclass.week1;

public class ChildClass extends ParentClass {
	
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.dance();
		childClass.walk(2);
		
		
		ParentClass parentClass = new ParentClass();
		parentClass.dance();
		parentClass.walk(4);
	}
	
	@Override
	public void dance() {
		System.out.println("I am dancing");
	}

}
