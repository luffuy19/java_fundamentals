package com.chainys.day7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BankValidation {
	public static Scanner sc=new Scanner(System.in);
	public static long validateAccntNo(String accntNo) {
		if(Pattern.matches("^[0-9]{15}$", accntNo) ) {
			return Long.parseLong(accntNo);
		}
		System.out.println("Enter the correct account number");
		accntNo=sc.next();
		return validateAccntNo(accntNo);
	}
	public static String validateName(String name) {
		if(Pattern.matches("^[a-zA-Z]{3,25}", name)) {
			return name;
		}
		System.out.println(name+" is not in alphabet Enter correct creditional");
		name=sc.next();
		return validateName(name);
	}
	public static long validatePhoneNo(String phoneNo) {
		if(Pattern.matches("^[0-9]{10}$", phoneNo)) {
			return Long.parseLong(phoneNo);
		}
		System.out.println("Enter Value in Number "+phoneNo+" is not a number");
		phoneNo=sc.next();
		return validatePhoneNo(phoneNo);
	}
	public static String validateIfsc(String ifsc) {
		if(ifsc.matches("^[A-Z0-9]{5}")) {
			return ifsc;
		}
		System.out.println("Enter value in caps and aphanumeric");
		ifsc=sc.next();
		return validateIfsc(ifsc);
	}
}
