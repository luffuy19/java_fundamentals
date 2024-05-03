package com.chainsys.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GmailLogin {
	public static boolean gmailvalid(String gmail) {
		
		if(Pattern.matches("^[a-z]+[a-z0-9\\.]+@[a-z0-9]+\\.[a-z]{2,}$",gmail)) {
			return true;
		}
		return false;
	}
	public static boolean passwordvalid(String pasword) {
		
		if(Pattern.matches("^[A-Z]{1}[a-z0-9]{3,10}[*&%$#]{1}$",pasword)) {
			return true;
		}
		return false;
	}
	public static boolean namevalid(String name) {
		
		if(Pattern.matches("^[a-zA-Z]{2,25}$",name)) {
			return true;
		}
		return false;
	}
	public static boolean agevalid(String age) {
		
		if(Pattern.matches("^[0-9]{1,2}$",age)) {
			return true;
		}
		return false;
	}
	public static boolean dobvalid(String dob) {
		
		if(Pattern.matches("^[0-9]{1,2}\\-[0-9]{1,2}\\-[0-9]{4}$",dob)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1) Login press 1"+"\n"+"2) Sign Press 2");
		int n=sc.nextInt();
		switch(n) { 
			case 1 : System.out.println("Enter Gmail Id");
			   		 String gmail=sc.next();
			   		 while(true) {
			   			 if(gmailvalid(gmail)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter valid gmail only with lower case and combination of number with gmail extension");
			   			 gmail=sc.next();
			   		 }
			   		 System.out.println("Enter Password with begin with Caps end with special character");
			   		 String password=sc.next();
			   		while(true) {
			   			 if(passwordvalid(password)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter valid Password with begin with Caps end with special character");
			   			 password=sc.next();
			   		 }
			   		 System.out.println("You are sucessfully logged");
			   		 
			   		 break;
			case 2 : System.out.println("Enter your Name");
					 String name=sc.next();
					 while(true) {
			   			 if(namevalid(name)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter valid Name with only Alphabet");
			   			 name=sc.next();
			   		 }
					 System.out.println("Enter your age");
					 String age=sc.next();
					 while(true) {
			   			 if(agevalid(age)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter age in Number");
			   			 age=sc.next();
			   		 }
					 System.out.println("Enter your Date of Birth in format (DD-MM-YYYY)");
					 String dob=sc.next();
					 while(true) {
			   			 if(dobvalid(dob)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter valid Date Of Birth in format (DD-MM-YYYY)");
			   			 dob=sc.next();
			   		 }
					 System.out.println("Enter gmail start with lower case and combination of number with gmail extension");
			   		 String sgmail=sc.next();
			   		while(true) {
			   			 if(gmailvalid(sgmail)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter valid gmail start with lower case and combination of number with gmail extension");
			   			 sgmail=sc.next();
			   		 }
			   		 System.out.println("Enter Password with begin with Caps end with special character");
			   		 String spassword=sc.next();
			   		while(true) {
			   			 if(passwordvalid(spassword)) {
			   				 break;
			   			 }
			   			 System.out.println("Enter valid Password with begin with Caps End with special character length of 11 digits");
			   			 spassword=sc.next();
			   		 }
			   		System.out.println("you are successfully signed");
			   		break;   		 
		}
	}
	
}
