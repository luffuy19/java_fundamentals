package com.chainsys.method;

import java.util.Scanner;

public class TeenChecker {
	public static boolean hasTeen(int age1,int age2,int age3) {
		if((age1>=13&&age1<=19) || (age2>=13&&age2<=19) || (age3>=13&&age3<=19)) {
			return true;
		}
		return false;
	} 
	public static boolean isTeen(int age1) {
		if((age1>=13&&age1<=19)) {
			return true;
		}
		return false;
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age1=sc.nextInt();
		System.out.println("Enter the Age");
		int age2=sc.nextInt();
		System.out.println("Enter the Age");
		int age3=sc.nextInt();
		System.out.println();
	}
}
