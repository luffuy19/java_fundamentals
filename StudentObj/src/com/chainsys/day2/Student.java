package com.chainsys.day2;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		String studentName;
		String school;
		String location;
		char gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name");
		studentName = sc.next();
		System.out.println("Enter School Name");
		school=sc.next();
		System.out.println("Enter Location");
		location=sc.next();
		System.out.println("Enter Gender");
		gender=sc.next().charAt(0);
		System.out.println("studentName : "+studentName+"\n"+"school :"+school+"\n"+"Location :"+location+"\n"+"gender : "+gender);
	}
}
