package com.jdbc;
import java.sql.*;
public class Sql {
         static final String URL="jdbc:mysql://localhost:3306/idbi";
		 static final String User="root"; 
		 static final String pass="root";	 
		 
	public static void main(String[] args) throws Exception {
		try {
			Connection connection = DriverManager.getConnection(URL, User, pass);
		
		Statement createStatement = connection.createStatement();
		String data = "INSERT INTO Persons VALUES(14,'bhai',35,'lbnagar',456)";
		String data1 = "INSERT INTO Persons VALUES(15, 'SRAVAN',33,'SAInagar',256)";            
		createStatement.executeUpdate(data);
		createStatement.executeUpdate(data1);
		System.out.println("Data inserted into table");
		}catch (SQLException e) { 
		e.printStackTrace();

	}

	}}
