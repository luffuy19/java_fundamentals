package com.chainsys.cabfare;

import java.util.regex.Pattern;

public class Validation {
	public static boolean kmValid(String km) {
		
		if(Pattern.matches("^[0-9]{1,3}$",km)) {
			return true;
		}
		return false;
	}
	public static boolean cabNameValid(String cabName) {
		
		if((cabName.equals("mini") || cabName.equals("micro") ||cabName.equals("prime"))) {
			return true;
		}
		return false;
	}
}
