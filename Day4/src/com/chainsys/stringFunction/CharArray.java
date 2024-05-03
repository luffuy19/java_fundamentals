package com.chainsys.stringFunction;

public class CharArray {
	public static void main(String[] args) {
		String s="mugiwara";
		char[] arr=s.toCharArray();
		System.out.println("Using toCharArray");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n"+"\n"+"Using charAt");
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}
}
