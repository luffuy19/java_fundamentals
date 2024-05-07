package com.studentcrud.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.studentcrud.model.Teacher;
import com.studentcrud.test.StudentDb;

public class TeacherDao {
	public static void register() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String section=null;
		int n=0;
		boolean b=true;
		while(b) {
		System.out.println("Welcome to Student Application");
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("1) Login \n2) SignUp \n3) Exit");
		System.out.println("\nEnter the Choice");
		String num1 = sc.next();
		n= StudentValidation.validateNumber(num1);
		switch(n) {
			case 1 : System.out.print("Enter Teacher User Creditinal : ");
					 String username = sc.next();
					 String validateName = StudentValidation.validateName(username);
					 System.out.println();
					 System.out.print("Enter Password : ");
					 String password = sc.next();
					 String validatepassword = StudentValidation.validatepassword(password);
					 StudentDb db = new StudentDb();
					 boolean loginCheck = db.loginCheck(validateName, validatepassword);
					 if(loginCheck==true) {
						 section= StudentDb.findClass(validateName);
						 StudentDao.logic(loginCheck, section);
					 }
					 else {
						 System.out.println("\nInavlid user details\n");
						 register();
					 }
					 b=false;
					 break;
					 
			case 2 : System.out.println("Enter your Name as per your AddarCard");
			         username=sc.next();
			         validateName = StudentValidation.validateName(username);
			         System.out.println("Enter your Password");
			         password = sc.next();
					 validatepassword = StudentValidation.validatepassword(password);
					 System.out.println("Enter the section");
					 section=sc.next();
					 section = StudentValidation.validateCharacter(section);
					 Teacher teacher = new Teacher();
					 teacher.setTeacherName(validateName);
					 teacher.setPassword(validatepassword);
					 teacher.setSection(section);
					 StudentDb.insertTeacherDetails(teacher);
					 break;

			case 3 : b=false;
					 break;		 
			}
		}
	}
}
