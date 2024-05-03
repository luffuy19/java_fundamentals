package com.chainsys.stringFunction;

public class Equals {
	public static void main(String [] args) {
		String s1="Mani";
		String s2="mani";
		System.out.println(s1.equals(s2)); // Case Sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); // Not case Sensitive
	}
}
