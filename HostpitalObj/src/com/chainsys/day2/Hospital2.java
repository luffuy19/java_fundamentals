package com.chainsys.day2;

import java.util.Scanner;

public abstract class Hospital2 implements Hospital1{
	public void hospitalDetails() {
		String HospitalName;
		int noOfAmbulance;
		String location;
		boolean hasDoctorAvaiable;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hospital Name");
		HospitalName = sc.next();
		System.out.println("Enter Ambulance count");
		noOfAmbulance=sc.nextInt();
		System.out.println("Enter Hospital Location");
		location=sc.next();
		System.out.println("Enter Doctor Avaviablity");
		hasDoctorAvaiable=sc.nextBoolean();
		System.out.println("HospitalName : "+HospitalName+"\n"+"No of Ambulance :"+noOfAmbulance+"\n"+"Location :"+location+"\n"+"hasDoctorAvaiable : "+hasDoctorAvaiable);
	}
	
}
