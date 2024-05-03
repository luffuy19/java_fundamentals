package com.chainsys.student;

public class Message extends MessageAbstract {

	@Override
	public void switchMessage() {
		System.out.println();
		System.out.println("Enter the Option" + "\n" + "\n" + "1 ) Update Name" + "\n" + "2 ) Update Attendence"
				+ "\n" + "3 ) Update Student Rank" + "\n" + "4 ) Update Student Class" + "\n"
				+ "5 ) Update Student Mentor" + "\n" + "6 ) Update Student Total" + "\n"
				+ "7 ) Update Student Standard" + "\n" + "8 ) Delete Student" + "\n" + "9 ) Add Student" + "\n"
				+ "10) Show Student Detail" + "\n" + "11) Exit");
		System.out.println();
	}
	
}
