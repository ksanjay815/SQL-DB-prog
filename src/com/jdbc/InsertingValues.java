package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValues {
	private static final String URL = "jdbc:mysql://localhost:3306/marolix";
	private static final String USER = "root";
	private static final String PASS = "root";

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			Statement createStatement = connection.createStatement();
			String data = "INSERT INTO REGISTRATION VALUES(4,'maxwell','Glenn',35)";
			createStatement.executeUpdate(data);

			System.out.println("Data inserted into table");
		} catch (SQLException e) {
			e.printStackTrace();
		
		
			
		}

	}
}
