package com.chainsys.stringFunction;

public class Trim {
	public static void main(String[] args) {
		String s=" Luffy King Of The Pirate";
		System.out.println("Before"+"\n"+s);
		String trim = s.trim();
		System.out.println("After"+"\n"+trim);
		String[] split =s.trim().split(" ");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
	}
}
