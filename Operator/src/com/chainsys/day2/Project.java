package com.chainsys.day2;

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter English Mark");
		int english=sc.nextInt();
		System.out.println("Enter Tamil Mark");
		int tamil=sc.nextInt();
		System.out.println("Enter Maths Mark");
		int maths=sc.nextInt();
		System.out.println("Enter Physics Mark");
		int physics=sc.nextInt();
		System.out.println("Enter Chemistry Mark");
		int chemistry=sc.nextInt();
		System.out.println("Enter CS Mark");
		int computerScience=sc.nextInt();
		int n=1 ;
		int totals=english+tamil+maths+physics+chemistry+computerScience;
		while(n!=5) {
			System.out.println("1. Total"+"\n"+"2. Percentage"+"\n"+"3. CutOff"+"\n"+"4. Result"+"\n"+"5. close");
			 n=sc.nextInt();
			switch(n){
				case 1 : System.out.println("Total Marks : "+totals);
						 break;
						 
				case 2 : long percentage=(totals/6)	;
						 System.out.println("Percentage : "+percentage);
						 break;
				case 3 : int cutoff=(physics/4)+(chemistry/4)+(maths/2);
						 System.out.println("CutOff : " +cutoff);
						 break;
				case 4 : if(english>35 && tamil>35 && maths>35 && physics>35 && chemistry>35 && computerScience>35) {
							System.out.println("Pass");
						 }
					     else {
					    	 System.out.println("fail");
					     }
				case 5 : n=5;
						 break;
			}
		}
		
		
	}
}
