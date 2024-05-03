package com.chainsys.stringFunction;

import java.util.Scanner;

public class UpperLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		System.out.println(sc.next().toLowerCase());
		System.out.println("Enter the Password");
		System.out.println(sc.next().toUpperCase());
	}
}
