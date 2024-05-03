package com.chainsys.cabfare;

public class Discount {
	public static double hasdiscount(int fare) {
		if(fare>2000) {
			double discount =fare-fare*0.02;
			System.out.println("Your Travel Fare is "+discount+" you got discount of 2%");
			return discount;
		}
		else if(fare>5000){
			double discount=fare-fare*0.05;
			System.out.println("Your Travel Fare is "+discount+" you got discount of 5%");
			return discount;
		}
		else {
			System.out.println("Your Travel Fare is "+fare);
			return fare;
		}
	}
}
