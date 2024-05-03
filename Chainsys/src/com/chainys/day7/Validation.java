package com.chainys.day7;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	public static Scanner sc=new Scanner(System.in);
	public static String validateId(String id) {
		if(Pattern.matches("^[1-9]+", id)) {
			return id;
		}
		System.out.println("Enter Value in Number "+id+" is not a number");
		id=sc.next();
		return validateId(id);
	}
	public static String validateWord(String word) {
		if(Pattern.matches("^[a-zA-Z]{3,}$", word)) {
			return word;
		}
		System.out.println("Enter the correct Name "+word+" this is invalid");
		word=sc.next();
		return validateWord(word);
	}
	public static String validateDate(String date) {
		if(Pattern.matches("[0-9]{2}\\-[0-9]{2}\\-[0-9]{4}", date)) {
			return date;
		}
		System.out.println("Enter in correct date Format (DD-MM-YYYY) "+date+" this incorrect");
		date=sc.next();
		return validateDate(date);
	}
}
