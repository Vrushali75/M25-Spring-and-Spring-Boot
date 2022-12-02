package com.example.demo;

import org.springframework.stereotype.Component;

@Component

/*
 * Below annotation is used to denote a class is a component
 * It allows spring to automatically detect our custom beans 
 */
public class Student {
	
	//private data members
	private int rollno;
	private String name;
	
	//setters and getters method to access private data members
	/*public int getRollno() {
		return rollno;
	}*/
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	
	//user defined method
	public void print()
	{
		System.out.println("Welcome to M25 batch");
	}
	
	//default constructor
	public Student() {
		super();
		System.out.println("Welcome to TNS INDIA Foundation !");

	}
	
	
	
	
}
