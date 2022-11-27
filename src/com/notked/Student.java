package com.notked;

import java.util.Scanner;

public class Student {
	
	private String name;
	private int id;
	private String course;
	private boolean resident;
	private int[] modules;
	private int[] grades;
	private Main main;
	
	public Student(Main main) {
		this.main = main;
		// String name, int id, String course, boolean resident, int[] modules, int[] grades
//		this.name = name;
//		this.id = id;
//		this.course = course;
//		this.resident = resident;
//		this.modules = modules;
//		this.grades = grades;
	}

	public void createStudent() {
		Scanner scanner = new Scanner(System.in);
		print("What is the students name?: \n");
		name = scanner.next();
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
}
