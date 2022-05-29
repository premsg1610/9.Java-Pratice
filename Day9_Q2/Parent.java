package com.Day9_Q2;

public class Parent {

	final int number;
	
	
	public void method1() {
		System.out.println("Method 1 bleongs to parent class");
	}
	
	
	public final void method2() {
		System.out.println("Method 2 bleongs to parent class");
		}
	
	public void method3() {
		System.out.println("Method 3 bleongs to parent class");
	}
	
	public Parent(int number) {
		
		this.number = number;
	}
	
	
}
