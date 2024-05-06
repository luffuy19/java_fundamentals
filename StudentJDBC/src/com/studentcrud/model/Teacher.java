package com.studentcrud.model;

public class Teacher {
	public String teacherName;
	public String password;
	public String section;
	public Teacher(String teacherName, String password,String section) {
		super();
		this.teacherName = teacherName;
		this.password = password;
		this.section = section;
	}
	public Teacher() {
		super();
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", password=" + password + ", section=" + section + "]";
	}
	
	
}
