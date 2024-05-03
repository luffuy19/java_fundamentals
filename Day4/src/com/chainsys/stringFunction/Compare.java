package com.chainsys.stringFunction;

public class Compare {
	public static void main(String [] args) {
		String word1="kishore";
		String word2="kishore";
		String word3="Kishor1";
		System.out.println(word1.compareTo(word2));
		System.out.println(word1.compareTo(word3));
		System.out.println(word1.compareToIgnoreCase(word3));
	}
}
