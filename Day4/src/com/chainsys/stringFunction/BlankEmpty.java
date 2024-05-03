package com.chainsys.stringFunction;

public class BlankEmpty {
	public static void main(String[] args) {
		String s1=new String();
		String s2=new String(" Mani");
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		System.out.println(s1.isBlank());
		//blank did not count the spaces
	}
}
