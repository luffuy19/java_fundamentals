package com.chainsys.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args) {
		String s="manni19";
		String regex="\\d+";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("? Quantifier");
		System.out.println(Pattern.matches(".a", "ma"));
		System.out.println(Pattern.matches("...i", "mani")); // dot represent single character
		System.out.println(Pattern.matches("[abc]", "b")); //any one should appear
		System.out.println(Pattern.matches("[man]?", "m")); //occur only one time
		System.out.println(Pattern.matches("[man]?", "mm")); 
		System.out.println("+ Quantifier");
		System.out.println(Pattern.matches("[maan]+","a")); // more than one time
		System.out.println(Pattern.matches("[man]+","naaaaaammmmmmm")); // you can also compare more value
		System.out.println("* Quantifier");
		System.out.println(Pattern.matches("[mani]*", "man")); // Appear once or not
		System.out.println("Meta Chatracter");
		/* 
		 * 
			Regex	Description
			.	Any character (may or may not match terminator)
			\d	Any digits, short of [0-9]
			\D	Any non-digit, short for [^0-9]
			\s	Any whitespace character, short for [\t\n\x0B\f\r]
			\S	Any non-whitespace character, short for [^\s]
			\w	Any word character, short for [a-zA-Z_0-9]
			\W	Any non-word character, short for [^\w]
			\b	A word boundary
			\B	A non word boundary
		 * */
		System.out.println(" Regex \\d ");
		System.out.println(Pattern.matches("\\d", "1")); // contain number false
		System.out.println(Pattern.matches("\\d", "jdhd")); // not have Number
		System.out.println(Pattern.matches("\\d*", "1234")); // more than one number but have *
		System.out.println("regex \\D");
		System.out.println(Pattern.matches("\\D", "abc"));// non digits more than once
		System.out.println(Pattern.matches("\\D", "1"));// digits 
		System.out.println(Pattern.matches("\\D", "4443"));// digits  
		System.out.println(Pattern.matches("\\D", "323abc"));// digits and character 
		System.out.println(Pattern.matches("\\D", "m"));// true its do not have number 
		
		System.out.println("regex \\s");
		System.out.println(Pattern.matches("\\s*[a]*","    aaa"));
		
		System.out.println("Username regex");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Mani19"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Man&19"));
	}
}
