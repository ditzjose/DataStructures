package com.database;

import static java.lang.Class.forName;
import static java.lang.System.out;
import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementClass {
	public static void main(String... command) throws ClassNotFoundException,
			SQLException {
		// CRUD operation
		forName("com.mysql.jdbc.Driver");// Driver is loaded over here
		Connection connection = getConnection(
				"jdbc:mysql://localhost:3306/dbexample1_db", "root",
				"1212Sophy");
		// Extablish connection between Driver and Database Engine
		// For the OPtimized performance use prepared statment
		// Using Prepared statment Tokenizing,Parsing,Optimizing, Execution will be done only once.
		//we dont have to hard code the where codition instead we can use parameter.
		// There are parameter holder
		// Use Statement object or PreparedStatement object, CallableStatement
		// Object
		//PreparedStatement statement = (PreparedStatement) connection.prepareStatement("SELECT * FROM dbexample1_db.userorder where OrderID = ?");
		// ? are used as the placeholder for the parameter
		// Use Statement object or PreparedStatement object, CallableStatement
		 PreparedStatement statement =  connection.prepareStatement("SELECT * FROM dbexample1_db.userorder where OrderID = ?");
		 statement.setString(1,"1690805907");
		 ResultSet resultset = statement.executeQuery();
		 // Could use executeQuery() for select statements
		 // Could use executeUpdate() for DML statements
		 // Could use execute() for both select statements and for DML statements
		
		while(resultset.next())
		{
				out.println( resultset.getString("OrderID")+"  "+resultset.getString("Title")+""
						+ "  "+resultset.getString("userID"));
		}
		
	}
}
