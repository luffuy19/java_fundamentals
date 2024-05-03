package com.chainsys.cabfare;

import java.util.Scanner;
import java.util.regex.Pattern;
/*
 * cab fare
Enter the km: 10
Enter Cab Type : Prime

Choose the cab type:
* Micro ( Rs.10 per km )
* Mini ( Rs.15 per km )
* Prime (Rs.20 per km)

Calculate the cab fare
ECommerce Discount Calculation and Coupon Code
* Get total bill : 3000
Get the needed details from User.
Discount Rules:
* 2% discount for bill amount greater than 2000
* 5% discount for bill amount greater than 5000
Coupon Code:
* COUP_2 means 2% discount on bill amount
* COUP_5 means 5% discount on bill amount
 */
public class MainCab {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Cab Name Given below "+"\n"+"Micro ( Rs.100 per km ) "+"\n"+"Mini ( Rs.150 per km )"+"\n"+"Prime (Rs.200 per km)");
		String cabType=sc.next().toLowerCase();
		System.out.println("Enter the Km You want to Travel");
		String km=sc.next();
		Fare.cabFare(cabType, km);
	}
}
