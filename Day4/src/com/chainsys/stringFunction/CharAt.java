package com.chainsys.stringFunction;

public class CharAt {
	public static void main(String[] args) {
		String word="Kishore";
		for(int i=0;i<word.length();i++) {
			System.out.println(word.charAt(i));
		}
		System.out.println(word.chars());
		System.out.println(word.codePointAt(1)); // return ask key value
		System.out.println(word.codePointBefore(1));
		System.out.println(word.codePointCount(1, 5));
		System.out.println(word.codePointCount(0, word.length()-1));
	}
}
