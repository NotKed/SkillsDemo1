package com.notked;

import java.util.Scanner;

/**
 * 
 * @author kyleedwards
 * Date: 27/11/2022 19:22
 *
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// We pre-define our variables just to make the code neater.
		String name, id, course;
		boolean resident = false;
		String[] modules, grades, credits;
		
		
		System.out.println("Please enter the following details.\nStudent name: ");
		// Use scanner to retrieve the name of the student and store it in a variable for later use.
		name = scanner.next();
		
		System.out.println("Student ID: \n");
		id = scanner.next();
		
		System.out.println("Course studied: \n");
		course = scanner.next();
		
		// For the residency field, we will ask for a true or false statement from the user.
		// Since resident is pre-defined as false, we only have to change it if the answer is true.
		System.out.println("Does the student live on campus? (Please answer 'true' or 'false')\n");
		String nextScan = scanner.next();
		if(nextScan.equalsIgnoreCase("true")) resident = true;
		
		// For the next batch of data, we are looking at 3 different variables per field.
		// We will use lists to store this data, and use formatting to read it from the user.
		
		System.out.println("Number of modules completed per semester.");
		System.out.println("Please provide the data using this format. 'semester 1/semester 2/semester 3' (without '')");
		System.out.println("Example: '5/4/7'\n");
		modules = scanner.next().split("/");
		
		// Instead of spamming the console, we will just advise the user to use the same format for each variable.
		System.out.println("Overall grade per semester.");
		System.out.println("Please use the same format provided for the last input.\n");
		grades = scanner.next().split("/");
		
		System.out.println("Credits achieved per semester.");
		System.out.println("Please use the same format provided for the last input.\n");
		credits = scanner.next().split("/");
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(course);
		System.out.println(resident);
		System.out.println(modules);
		System.out.println(grades);
		System.out.println(credits);
	}
	
	
	
}
