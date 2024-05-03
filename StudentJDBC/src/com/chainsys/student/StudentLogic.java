package com.chainsys.student;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentLogic {
	public static void logic() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Message message = new Message();
		message.startingMessage();
		System.out.print("Enter Teacher User Creditinal : ");
		String username = sc.next();
		String validateName = StudentValidation.validateName(username);
		System.out.println();
		System.out.print("Enter Password : ");
		String password = sc.next();
		String validatepassword = StudentValidation.validatepassword(password);
		boolean loginCheck = StudentDb.loginCheck(validateName, validatepassword);
		int n = 1;
		int num = 0;
		
		if (loginCheck==true) {
			
			message.switchMessage();
			while (n == 1) {
				String num1 = sc.next();
				num = StudentValidation.validateNumber(num1);
				switch (num) {

				case 1:
					System.out.println("Enter the Student Name");
					String name = sc.next();
					System.out.println("Enter your RollNo");
					String rollNo = sc.next();
					StudentDb.updateName(rollNo, name);
					break;
				case 2:
					System.out.println("Enter the Student Attendence percentage");
					String attendence = sc.next();
					System.out.println("Enter your RollNo");
					String attendenceRollNo = sc.next();
					StudentDb.updateAttendence(attendenceRollNo, attendence);
					break;
				case 3:
					System.out.println("Enter the Student Rank");
					String rank = sc.next();
					System.out.println("Enter your RollNo");
					String rankRollNo = sc.next();
					StudentDb.updateStudentRank(rankRollNo, rank);
					break;
				case 4:
					System.out.println("Enter the Student Class");
					String studentClass = sc.next();
					System.out.println("Enter your RollNo");
					String classRollNo = sc.next();
					StudentDb.updateStudentClass(classRollNo, studentClass);
					break;
				case 5:
					System.out.println("Enter the Student Mentor");
					String mentor = sc.next();
					System.out.println("Enter your RollNo");
					String mentorRollNo = sc.next();
					StudentDb.updateStudentMentor(mentorRollNo, mentor);
					break;
				case 6:
					System.out.println("Enter your Total");
					String total = sc.next();
					System.out.println("Enter the RollNo");
					String totalRollNo = sc.next();
					StudentDb.updateStudentTotal(totalRollNo, total);
					break;
				case 7:
					System.out.println("Enter the standard");
					String standard = sc.next();
					System.out.println("Enter the RollNo");
					String standardRollNo = sc.next();
					StudentDb.updateStandard(standardRollNo, standard);
				case 8:
					System.out.println("Enter the RollNo");
					String deleteRollNo = sc.next();
					StudentDb.deleteStudent(deleteRollNo);
					break;
				case 9:
					StudentDb.addStudent();
					break;
				case 10:
					StudentDb.showStudentDetails();
					break;
				case 11:
					n = 3;
					break;
				}

			}
		} else {
			System.out.println("\n" + "User Not found");
		}
		sc.close();
	}
}
