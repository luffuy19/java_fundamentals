package com.chainsys.cabfare;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Coupon {
	static Scanner sc=new Scanner(System.in);
	public static void hasCoupon(double fare) {
		System.out.println("Do You coupon (Press 1 or 2)"+"\n"+"1) Yes"+"\n"+"2) No");
		String choice=sc.next();
		while(true) {
			if(Pattern.matches("^[1-2]+", choice)) {
				switch(choice) {
				case "1": System.out.println("Enter your coupon code"+"\n"+"If you using cab frist Time use copy 'firstride' ");
						String coupon=sc.next();
					    if(coupon.equalsIgnoreCase("firstride")) {
					    	System.out.println(fare-(fare*0.05));
					    	break;
					    }
					    else if(coupon.equalsIgnoreCase("regularcustomer")) {
					    	System.out.println(fare-(fare*0.05));
					    	break;
					    }
					    else {
					    	System.out.println("Invalid Coupon");
					    }
					    
				case "2": System.out.println("okay Thanks for using our Cab service");
						break;	    
				}
				break;
			}
			else {
				System.out.println("Wrong option if You have coupon (Press 1 or 2)"+"\n"+"1) Yes"+"\n"+"2) No");
				choice=sc.next();
			}
		}
	}
}
