package com.chainsys.day8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentValidation {
	public static String redColor = "\u001B[31m";
	public static String resetColor = "\u001B[0m";
	public static Scanner sc=new Scanner(System.in);
	public static int validateRollNo(String rollNo) {
		int number = validateNumber(rollNo);
		while(true) {
			if(number>=3500) {
				return number;
			}
			System.out.println(redColor+"Enter value from 3500"+resetColor);
			number=sc.nextInt();
		}
	}
	public static String validateName(String name) {
		if(Pattern.matches("^[a-zA-Z]{3,25}", name)) {
			return name;
		}
		System.out.println(redColor+name+" is not in alphabet Enter correct creditional"+resetColor);
		name=sc.next();
		return validateName(name);
	}
	
	public static int validateNumber(String attendence) {
		if(attendence.matches("^[0-9]+$")) {
			return Integer.parseInt(attendence);
		}
		System.out.println(redColor+"Enter Value in Number "+attendence+" is not a number"+resetColor);
		attendence=sc.next();
		return validateNumber(attendence);
	}	
	public static char validateCharacter(String studentClass) {
		if(studentClass.matches("^[A-Z]{1}$")) {
			return studentClass.charAt(0);
		}
		System.out.println(redColor+"Enter Value in character "+studentClass+" is not a character"+resetColor);
		studentClass=sc.next();
		return validateCharacter(studentClass);
	}	
	public static String validateStandard(String standard) {
		if(standard.matches("^[I||II||III||IV||V||VI||VII||VIII||IX||X]+$")) {
			return standard;
		}
		System.out.println(redColor+"Enter the valid Standard in RomanLetter(I||II||III||IV||V||VI||VII||VIII||IX|X)"+resetColor);
		standard=sc.next();
		return validateStandard(standard);
	}
	public static String validatepassword(String password) {
		if(password.matches("^[A-Z][a-z]+[0-9]+[*#$%&!]$")) {
			return password;
		}
		System.out.println(redColor+"Enter the Password with alteast one Caps and ends with Number"+resetColor);
		password=sc.next();
		return validatepassword(password);
	}
}
