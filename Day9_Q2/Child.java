package com.Day9_Q2;

import java.util.Scanner;

public final class Child extends Parent  {

	 
	 @Override
	public void method1() {
		
		System.out.println("Method 1 bleongs to child class");
		 
		if(number>0 && number<=10)
		{
			System.out.println("Number is: " + number);
		}
		else {
			System.out.println("Invalid number");
		}
	}
	 
	 public void method4() {
		 System.out.println("Method 4 bleongs to child class");
	 }
	 
	 public Child(int number) {
		 super(number);
	 }
	 
	 public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter number:");
		 int number = input.nextInt();
		 
		 input.close();
		 
		 
		 Parent p1 = new Child(number);
		 p1.method1();
		 p1.method2();
		 p1.method3();
		 
		 Child c1 = (Child)p1;
		 c1.method4();
		 
		 
		 
		
		 
	}
}
