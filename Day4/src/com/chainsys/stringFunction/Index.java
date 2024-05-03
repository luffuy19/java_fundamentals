package com.chainsys.stringFunction;

public class Index {
	public static void main(String[] args) {
		String s="mugiwarrrrra";
		System.out.println(s.indexOf('w'));
		System.out.println(s.indexOf("wara"));
		System.out.println(s.indexOf('a', 6)); //starting from the 6 index
		System.out.println(s.indexOf("z", 0)); // if not present it will give negative value
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('i', s.length()-1)); // surfing from the last
	}
}
