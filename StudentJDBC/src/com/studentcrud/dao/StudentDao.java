package com.studentcrud.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.studentcrud.test.StudentDb;

public class StudentDao {
	public static void logic(boolean b,String section, String teacherName) throws SQLException {
		int n = 1;
		int num = 0;
		Scanner sc=new Scanner(System.in);
		if (b==true) {
			
			System.out.println();
			System.out.println("Enter the Option" + "\n" + "\n" + "1 ) Update Name" + "\n" + "2 ) Update Attendence"
					+ "\n" + "3 ) Update Student Rank" + "\n" + "4 ) Update Student Class" + "\n"
					+ "5 ) Enter student Quaterly Total" +"\n"+ "6 ) Enter student Half yearly Total" +"\n"+"7 ) Enter Student Annual Total" + "\n"
					+ "8 ) Update Student Standard" + "\n" + "9 ) Delete Student" + "\n" + "10) Add Student" + "\n"
					+ "11) Show Student Detail" + "\n" + "12) Exit");
			System.out.println();
			while (n == 1) {
				System.out.println("Enter the Choice");
				num = StudentValidation.checkNumber();
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
					System.out.println("Enter your Quaterly Total");
					String quaterlyTotal = sc.next();
					System.out.println("Enter the RollNo");
					String quaterlyRollNo = sc.next();
					StudentDb.updateStudentQuartely(quaterlyRollNo, quaterlyTotal, section);
					break;	
				case 6:
					System.out.println("Enter Student Half yearly Total");
					String halfYearlyTotal = sc.next();
					System.out.println("Enter the RollNo");
					String halfRollNo = sc.next();
					StudentDb.updateStudenthalfYearly(halfRollNo, halfYearlyTotal, section);
					break;
				case 7:
					System.out.println("Enter your Total");
					String annualtotal = sc.next();
					System.out.println("Enter the RollNo");
					String annualRollNo = sc.next();
					StudentDb.updateStudentAnnualExam(annualRollNo, annualtotal, section);
					break;
				case 8:
					System.out.println("Enter the standard");
					String standard = sc.next();
					System.out.println("Enter the RollNo");
					String standardRollNo = sc.next();
					StudentDb.updateStandard(standardRollNo, standard,section);
				case 9:
					System.out.println("Enter the RollNo");
					String deleteRollNo = sc.next();
					StudentDb.deleteStudent(deleteRollNo,section);
					break;
				case 10:
					StudentDb db = new StudentDb();
					db.addStudent(section,teacherName);
					break;
				case 11:
					StudentDb.showStudentDetails(section);
					break;
				case 12:
					n = 3;
					break;
				default : System.out.println("Wrong Choice Enter (1 to 11)");
				}
			}
		}
		else {
			System.out.println("\n" + "User Not found");
		}
		
	}
}
