package com.studentcrud.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.studentcrud.test.StudentDb;

public class StudentDao {
	public static void logic(boolean b,String section) throws SQLException {
		int n = 1;
		int num = 0;
		Scanner sc=new Scanner(System.in);
		if (b==true) {
			
			System.out.println();
			System.out.println("Enter the Option" + "\n" + "\n" + "1 ) Update Name" + "\n" + "2 ) Update Attendence"
					+ "\n" + "3 ) Update Student Rank" + "\n" + "4 ) Update Student Class" + "\n"
					+ "5 ) Update Student Mentor" + "\n" + "6 ) Update Student Total" + "\n"
					+ "7 ) Update Student Standard" + "\n" + "8 ) Delete Student" + "\n" + "9 ) Add Student" + "\n"
					+ "10) Show Student Detail" + "\n" + "11) Exit");
			System.out.println();
			while (n == 1) {
				System.out.println("Enter the Choice");
				String num1 = sc.next();
				num = StudentValidation.validateNumber(num1);
				switch (num) {
				case 1:
					System.out.println("Enter the Student Name");
					String name = sc.next();
					System.out.println("Enter your RollNo");
					String rollNo = sc.next();
					StudentDb.updateName(rollNo, name,section);
					break;
				case 2:
					System.out.println("Enter the Student Attendence percentage");
					String attendence = sc.next();
					System.out.println("Enter your RollNo");
					String attendenceRollNo = sc.next();
					StudentDb.updateAttendence(attendenceRollNo, attendence, section);
					break;
				case 3:
					System.out.println("Enter the Student Rank");
					String rank = sc.next();
					System.out.println("Enter your RollNo");
					String rankRollNo = sc.next();
					StudentDb.updateStudentRank(rankRollNo, rank,section);
					break;
				case 4:
					System.out.println("Enter the Student Class");
					String studentClass = sc.next();
					System.out.println("Enter your RollNo");
					String classRollNo = sc.next();
					StudentDb.updateStudentClass(classRollNo, studentClass,section);
					break;
				case 5:
					System.out.println("Enter the Student Mentor");
					String mentor = sc.next();
					System.out.println("Enter your RollNo");
					String mentorRollNo = sc.next();
					StudentDb.updateStudentMentor(mentorRollNo, mentor,section);
					break;
				case 6:
					System.out.println("Enter your Total");
					String total = sc.next();
					System.out.println("Enter the RollNo");
					String totalRollNo = sc.next();
					StudentDb.updateStudentTotal(totalRollNo, total,section);
					break;
				case 7:
					System.out.println("Enter the standard");
					String standard = sc.next();
					System.out.println("Enter the RollNo");
					String standardRollNo = sc.next();
					StudentDb.updateStandard(standardRollNo, standard,section);
				case 8:
					System.out.println("Enter the RollNo");
					String deleteRollNo = sc.next();
					StudentDb.deleteStudent(deleteRollNo,section);
					break;
				case 9:
					StudentDb db = new StudentDb();
					db.addStudent(section);
					break;
				case 10:
					StudentDb.showStudentDetails(section);
					break;
				case 11:
					n = 3;
					break;
				}

			}
		}
		else {
			System.out.println("\n" + "User Not found");
		}
		
	}
}
