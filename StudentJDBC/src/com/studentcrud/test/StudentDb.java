package com.studentcrud.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.studentcrud.dao.StudentInterface;
import com.studentcrud.dao.StudentValidation;
import com.studentcrud.model.Teacher;
import com.studentcrud.util.Connectionutil;

public class StudentDb implements StudentInterface{
	
	public static void show(String section) throws SQLException {
		
		String query = "select rollNo,studentName,attendence,studentRank,total,standard,studentClass,mentorName from student where studentClass=?";
		Connection con = Connectionutil.getConnections();
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,section);
		ResultSet rs = statement.executeQuery();
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
	public static void delete(int id, String section) throws SQLException {
		Connection connection = Connectionutil.getConnections();
		String query = "delete from student where rollNo=? && studentClass=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, id);
		statement.setString(1,section );
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Section was updated");
		} else {
			System.out.println("You can not make changes in "+section+"Section");
		}
	}
	public static void insertValues(int rollNo, String studentName, int atttendence, int studentRank, int quaterYearly,String standard,
		String studentClass, String mentorName, String teacherusername,int halfYearly,int annualExam) throws SQLException {
		Connection connection = Connectionutil.getConnections();
		String query = "insert into Student values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, rollNo);
		statement.setString(2, studentName);
		statement.setInt(3, atttendence);
		statement.setInt(4, studentRank);
		statement.setInt(5, quaterYearly);
		statement.setString(6, standard);
		statement.setString(7, studentClass);
		statement.setString(8, mentorName);
		statement.setString(9,teacherusername);
		statement.setInt(10,halfYearly);
		statement.setInt(11, annualExam);
		statement.execute();
		connection.close();
	}
	public static void updateName(String rollNo,String name, String section) throws SQLException {
		int validateNumber = StudentValidation.validateRollNo(rollNo);
		String validateName = StudentValidation.validateName(name);
		Connection con = Connectionutil.getConnections();
		String query="update student set studentName=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateName);
		statement.setInt(2, validateNumber);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Name was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateAttendence(String rollNo,String attendence,String section) throws SQLException {
		int validateNumber = StudentValidation.validateRollNo(rollNo);
		int validateAttendence = StudentValidation.validateNumber(attendence);
		Connection con = Connectionutil.getConnections();
		String query="update student set attendence=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateAttendence);
		statement.setInt(2, validateNumber);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Attendence Updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudentRank(String rollNo,String rank,String section) throws SQLException {
		int validateRank = StudentValidation.validateNumber(rank);
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		Connection con = Connectionutil.getConnections();
		String query="update student set studentRank=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1,validateRank);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Rank was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudentClass(String rollNo,String studentClass,String section) throws SQLException {
		String validateclass = StudentValidation.validateCharacter(studentClass);
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		Connection con = Connectionutil.getConnections();
		String query="update student set studentClass=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateclass);
		statement.setInt(2, validateRollNo);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student class was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudentMentor(String rollNo,String name,String section) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		String validateName = StudentValidation.validateName(name);
		Connection con = Connectionutil.getConnections();
		String query="update student set mentorName=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateName);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Mentor Name was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudentQuartely(String rollNo,String total,String section) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		int validateTotal = StudentValidation.validateNumber(total);
		Connection con = Connectionutil.getConnections();
		String query="update student set total=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateTotal);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Total was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudenthalfYearly(String rollNo,String total,String section) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		int validateTotal = StudentValidation.validateNumber(total);
		Connection con = Connectionutil.getConnections();
		String query="update student set half_yearly=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateTotal);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Total was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudentAnnualExam(String rollNo,String total,String section) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		int validateTotal = StudentValidation.validateNumber(total);
		Connection con = Connectionutil.getConnections();
		String query="update student set Annual_yearly=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateTotal);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Total was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStudent(String rollNo,String total,String section) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		int validateTotal = StudentValidation.validateNumber(total);
		Connection con = Connectionutil.getConnections();
		String query="update student set half_yearly=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, validateTotal);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Total was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void updateStandard(String rollNo,String standard,String section) throws SQLException {
		String validateStandard = StudentValidation.validateStandard(standard);
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		Connection con = Connectionutil.getConnections();
		String query="update student set standard=? where rollNo=? && studentClass=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, validateStandard);
		statement.setInt(2, validateRollNo);
		statement.setString(3,section);
		int execute = statement.executeUpdate();
		if (execute==1) {
			System.out.println("Student Standard was updated");
		} else {
			System.out.println("You can not make changes in "+section+" Section");
		}
		con.close();
	}
	public static void deleteStudent(String rollNo,String section) throws SQLException {
		int validateRollNo = StudentValidation.validateRollNo(rollNo);
		delete(validateRollNo,section);
	}
	public void addStudent(String section) throws SQLException {
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
//		System.out.println("Enter Student Quater yearly Mark");
//		String total1=sc.next();
//		int quaterYearly = StudentValidation.validateNumber(total1);
		System.out.println("Enter the Student standard");
		String standard=sc.next();
		String validateStandard = StudentValidation.validateStandard(standard);
		System.out.println("Enter Mentor Name");
		String mentor=sc.next();
		String validateMentor = StudentValidation.validateName(mentor);
		System.out.println("Enter Student Half Yearly Mark");
//		String total2=sc.next();
//		int halfYearly = StudentValidation.validateNumber(total2);
//		System.out.println("Enter Student Annual Mark");
//		String total3=sc.next();
//		int annualExam = StudentValidation.validateNumber(total3);
		Connection con = Connectionutil.getConnections();
		String query="select user_name from admin_users where section=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, section);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			String UserName=rs.getNString("user_name");
			insertValues(validateRollNo, validateName, validateAttendence, validateRank,0, validateStandard, section, validateMentor,UserName,0,0);
		}
		System.out.println("Values are Inserted");
//		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
//		System.out.printf("%9s %15s %15s %15s %15s %15s %15 %15s %15s %19s\n", "RollNo", "Student Name", "Attendence","Student Rank","Total","Standard","Student Class","Mentor Name");
//		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
//		System.out.printf("%8s %12s %15s %14s %19s %19s %19s %14s %14s %19s\n",validateRollNo, validateName, validateAttendence, validateRank, 0,0, validateStandard, section, validateMentor);
//		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public static void showStudentDetails(String section) throws SQLException {
		show(section);
	}
	public boolean loginCheck(String userNname,String password) throws SQLException {
		Connection con = Connectionutil.getConnections();
		String query="select user_name,password from admin_users where user_name=? && password=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,userNname);
		statement.setString(2,password);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			return true;
		}
		return false;
		
	}
	
	
	public static void insertTeacherDetails(Teacher teacher) throws SQLException{
		Connection con = Connectionutil.getConnections();
		String query="insert into admin_users values(?,?,?)";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,teacher.teacherName);
		statement.setString(2,teacher.password);
		statement.setString(3,teacher.section);
		int executeUpdate = statement.executeUpdate();
		System.out.println(executeUpdate);
	}
	public static String findClass(String teacherName) throws SQLException {
		Connection con = Connectionutil.getConnections();
		String query="select section from admin_users where user_name=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, teacherName);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			String studentClass=rs.getNString("section");
			return studentClass ;
		}
		return null;
	}

	
}
