package com.chainsys.day8;

public class Student {
	int rollNo;
	String studentName;
	int attendence;
	int studentRank;
	int total;
	String standard;
	char studentClass;
	String mentorName;
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}
	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setStudentClass(char studentClass) {
		this.studentClass = studentClass;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getAttendence() {
		return attendence;
	}
	public int getStudentRank() {
		return studentRank;
	}
	public int getTotal() {
		return total;
	}
	public char getStudentClass() {
		return studentClass;
	}
	public String getMentorName() {
		return mentorName;
	}
	
	public Student(int rollNo, String studentName, int attendence, int studentRank, int total, String standard,
			char studentClass, String mentorName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.attendence = attendence;
		this.studentRank = studentRank;
		this.total = total;
		this.standard = standard;
		this.studentClass = studentClass;
		this.mentorName = mentorName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", attendence=" + attendence
				+ ", studentRank=" + studentRank + ", total=" + total + ", standard=" + standard + ", studentClass="
				+ studentClass + ", mentorName=" + mentorName + "]";
	}
	
	
	
	
	
		
	
}
