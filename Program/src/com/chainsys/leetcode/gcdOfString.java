package com.chainsys.leetcode;
/*
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
 * (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */
public class gcdOfString {
	public static String logic(String str1,String str2) {
		if(str1.contains(str2)) {
			return str2;
		}
		else if(str2.contains(str1)){
			return str1;
		}
		return "";
	}
	public static void main(String[] args) {
		String str1 = "ABCABC" ;
		String str2 = "ABC" ;
		System.out.println(logic(str1, str2));
	}

}
