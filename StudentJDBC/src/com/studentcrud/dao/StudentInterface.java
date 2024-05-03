package com.studentcrud.dao;

import java.sql.SQLException;

public interface StudentInterface {
	public boolean loginCheck(String username,String password) throws SQLException ;
	public void addStudent() throws SQLException ;
}
