package com.notked;

import java.util.Scanner;

public class Student {
	
	private String name;
	private int id;
	private String course;
	private boolean resident;
	private int[] modules = new int[3];
	private int[] grades = new int[3];
	
	public Student() {
		// String name, int id, String course, boolean resident, int[] modules, int[] grades
//		this.name = name;
//		this.id = id;
//		this.course = course;
//		this.resident = resident;
//		this.modules = modules;
//		this.grades = grades;
	}

	public void createStudent() {
		// We use a scanner to read data in from the console.
		Scanner scanner = new Scanner(System.in);
		
		// We begin by asking the user details about the student to store.
		print("Please enter the following details.\nStudent name?: \n");
		name = scanner.nextLine();
		
		print("Student ID?: \n");
		// Because the ID is in the form of an integer and we receive the lines in the form of Strings, we must parse it as an integer.
		id = Integer.parseInt(scanner.nextLine());
		
		print("Student Course?: \n");
		course = scanner.nextLine();
		
		// Much like the integer, we require a boolean for the residency question. We will use an if statement to determine this.
		print("Does the student live on campus?: (Please answer 'true' or 'false')");
		String nextScan = scanner.nextLine();
		if(nextScan.equalsIgnoreCase("true")) resident = true;
		else resident = false;
		
		// Moving onto the next fields, we are looking at 3 different variables per field. To make it easier, we will use formatting 
		// to receive this data, then break it down into the integer lists that we want to store it in.
		print("Number of modules completed per semester.");
		print("Please provide the data using this format. 'semester 1/semester 2/semester 3' (without '')");
		print("Example: '5/4/7'\n");
		String[] moduleStrings = scanner.nextLine().split("/");
		for(int i = 0; i < moduleStrings.length; i++) {
			modules[i] = Integer.parseInt(moduleStrings[i]);
		}
		
		// We can use the same bit of code for the next question, as our answers should be relatively similar, at least the formatting will be.
		print("Overall grade per semester.");
		print("Please provide the data using this format. 'semester 1/semester 2/semester 3' (without '')");
		print("Example: '5/4/7'\n");
		String[] gradeStrings = scanner.nextLine().split("/");
		for(int i = 0; i < gradeStrings.length; i++) {
			grades[i] = Integer.parseInt(gradeStrings[i]);
		}
		
		for(int i = 0; i <grades.length; i++) {
			System.out.println(grades[i]);
		}
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
}
