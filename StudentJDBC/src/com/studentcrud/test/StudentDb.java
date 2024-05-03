package com.studentcrud.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.studentcrud.dao.StudentInterface;
import com.studentcrud.dao.StudentValidation;
import com.studentcrud.util.Connectionutil;

public class StudentDb implements StudentInterface{
	
	public static void show() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from student";
		Connection con = Connectionutil.getConnections();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int columnsNumber = rsmd.getColumnCount();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s\n", "RollNo", "Student Name", "Attendence","Student Rank","Total","Standard","Student Class","Mentor Name");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				// if (i > 1) System.out.print(", ");
				String columnValue = rs.getString(i);
				
				System.out.printf("%15s",columnValue);
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

		con.close();

	}
	public static void delete(int id) throws SQLException {
		Connection connection = Connectionutil.getConnections();
		String query = "delete from student where rollNo=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, id);
		boolean execute = statement.execute();
		if (execute==true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}
	public static void insertValues(int rollNo, String studentName, int atttendence, int studentRank, int total,String standard,
			String studentClass, String mentorName) throws SQLException {
		Connection connection = Connectionutil.getConnections();
		String query = "insert into Student values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, rollNo);
		statement.setString(2, studentName);
		statement.setInt(3, atttendence);
		statement.setInt(4, studentRank);
		statement.setInt(5, total);
		statement.setString(6, standard);
		statement.setString(7, studentClass);
		statement.setString(8, mentorName);
		statement.execute();
		connection.close();
	}
	public static void updateName(String rollNo,String name) throws SQLException {
		int validateNumber = StudentValidation.validateRollNo(rollNo);
		String validateName = StudentValidation.validateName(name);
		Connection con = Connectionutil.getConnections();
		String query="update student set studentName=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateName);
		statement.setInt(2, validateNumber);
		statement.execute();
		con.close();
	}
	public static void updateAttendence(String rollNo,String attendence) throws SQLException {
		int validateNumber = StudentValidation.validateRollNo(rollNo);
		int validateAttendence = StudentValidation.validateNumber(attendence);
		Connection con = Connectionutil.getConnections();
		String query="update student set attendence=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateAttendence);
		statement.setInt(2, validateNumber);
		statement.execute();
		con.close();
	}
	public static void updateStudentRank(String rollNo,String rank) throws SQLException {
		int validateRank = StudentValidation.validateNumber(rank);
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		Connection con = Connectionutil.getConnections();
		String query="update student set studentRank=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1,validateRank);
		statement.setInt(2, validateRollNo);
		statement.execute();
		con.close();
	}
	public static void updateStudentClass(String rollNo,String studentClass) throws SQLException {
		String validateclass = StudentValidation.validateCharacter(studentClass);
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		Connection con = Connectionutil.getConnections();
		String query="update student set studentClass=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateclass);
		statement.setInt(2, validateRollNo);
		statement.execute();
		con.close();
	}
	public static void updateStudentMentor(String mentorName,String name) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(mentorName);
		String validateName = StudentValidation.validateName(name);
		Connection con = Connectionutil.getConnections();
		String query="update student set mentorName=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateName);
		statement.setInt(2, validateRollNo);
		statement.execute();
		con.close();
	}
	public static void updateStudentTotal(String rollNo,String total) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		int validateTotal = StudentValidation.validateNumber(total);
		Connection con = Connectionutil.getConnections();
		String query="update student set total=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateTotal);
		statement.setInt(2, validateRollNo);
		statement.execute();
		con.close();
	}
	public static void updateStandard(String rollNo,String standard) throws SQLException {
		String validateStandard = StudentValidation.validateStandard(standard);
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		Connection con = Connectionutil.getConnections();
		String query="update student set standard=? where rollNo=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateStandard);
		statement.setInt(2, validateRollNo);
		statement.execute();
		con.close();
	}
	public static void deleteStudent(String rollNo) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		delete(validateRollNo);
	}
	public void addStudent() throws SQLException {
		
		String a="Sachinnathan";
		String b="Suji";
		String c="Vinitha";
		String d="Suresh";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student RollNo");
		String rollNo=sc.next();
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		System.out.println("Enter your Name");
		String name=sc.next();
		String validateName = StudentValidation.validateName(name);
		System.out.println("Enter your Attedence percentage");
		String attendence=sc.next();
		int validateAttendence = StudentValidation.validateNumber(attendence);
		System.out.println("Enter your Rank");
		String rank=sc.next();
		int validateRank = StudentValidation.validateNumber(rank);
		System.out.println("Enter your Total");
		String total=sc.next();
		int validateTotal = StudentValidation.validateNumber(total);
		System.out.println("Enter the Student standard");
		String standard=sc.next();
		String validateStandard = StudentValidation.validateStandard(standard);
		System.out.println("Enter your Class");
		String StudentClass=sc.next();
		String validateClass = StudentValidation.validateCharacter(StudentClass);
		String validateMentor="";
		if(validateClass=="A")
			validateMentor=a;
		else if(validateClass=="B")
			validateMentor=b;
		else if(validateClass=="C")
			validateMentor=c;
		else if(validateClass=="D")
			validateMentor=d;
		insertValues(validateRollNo, validateName, validateAttendence, validateRank, validateTotal, validateStandard, StudentClass, validateMentor);
		System.out.println("Values are Inserted");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%9s %15s %15s %15s %15s %15s %15s %19s\n", "RollNo", "Student Name", "Attendence","Student Rank","Total","Standard","Student Class","Mentor Name");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%8s %12s %15s %14s %19s %14s %14s %19s\n",validateRollNo, validateName, validateAttendence, validateRank, validateTotal, validateStandard, StudentClass, validateMentor);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public static void showStudentDetails() throws SQLException {
		show();
	}
	public boolean loginCheck(String username,String password) throws SQLException {
		Connection con = Connectionutil.getConnections();
		String query="select username,password from admin_details where username=? && password=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,username);
		statement.setString(2,password);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			return true;
		}
		return false;
	}
	
	
}
