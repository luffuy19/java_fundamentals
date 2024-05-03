package com.chainsys.cabfare;

import java.util.Scanner;

public class Fare {
	static Scanner sc=new Scanner(System.in);
	public static String cabFare(String cabType,String km) {
		while(true) {
			if(Validation.cabNameValid(cabType)) {
				break;
			}
			System.out.println("Enter any Cab Type Given below "+"\n"+"Micro ( Rs.100 per km ) "+"\n"+"Mini ( Rs.150 per km )"+"\n"+"Prime (Rs.200 per km)");
			cabType=sc.next();
		}
		while(true) {
			if(Validation.kmValid(km)) {
				break;
			}
			System.out.println("Enter Km in Number");
			km=sc.next();
		}
		if(cabType.equals("mini") ) {
			int fare=Integer.parseInt(km)*150;
			double discount = Discount.hasdiscount(fare);
			Coupon.hasCoupon(discount);
		}
		else if(cabType.equals("micro")){
			int fare=Integer.parseInt(km)*100;
			double discount = Discount.hasdiscount(fare);
			Coupon.hasCoupon(discount);
		}
		else {
			int fare=Integer.parseInt(km)*200;
			double discount = Discount.hasdiscount(fare);
			Coupon.hasCoupon(discount);
		}
		return "";
	}
}
