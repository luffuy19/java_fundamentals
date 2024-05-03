package com.chainsys.stringFunction;

public class ContentEquals {
	public static void main(String[] args) {
		String s1="Luffy";
		System.out.println(s1.contentEquals("Luffy"));
		System.out.println(s1.contentEquals("luffy"));
		StringBuffer s2=new StringBuffer("Zoro");
		StringBuffer s3=new StringBuffer("Luffy");
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		//This is case sensistive also we can compare String with Buffer
	}
}
