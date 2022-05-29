package com.Day9_Q1;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}
	
	
	public Student(int roll, String name, int marks) {
		
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		
		displayDetails();
		
		return "";
	}
	
	
	public void displayDetails() {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String studentName = input.nextLine();
		
	    System.out.println("Enter roll no:");
	    int rollNo = input.nextInt();
	    
	    System.out.println("Enter marks:");
	    int marks = input.nextInt();
	    
		Student s1 = new Student(rollNo, studentName, marks);
		s1.setGrade(calculateGrade(marks));
		
		
		System.out.println("Student name is: " + s1.getName());
		System.out.println("Student roll no is: " + s1.getRoll());
		System.out.println("Student marks is: "+ s1.getMarks());
		System.out.println("Student grade is: " + s1.getGrade());
		
	}
	
	
	private char calculateGrade(int marks) {
		
		if(marks >= 500)
		{
			return 'A';
		}
		else if(marks >= 400 && marks < 500)
		{
			return 'B';
		}
		else {
			return 'C';
		}
		
	}
	
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
	
}
