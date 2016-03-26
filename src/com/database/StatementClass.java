package com.database;

import static java.lang.System.*;
import static java.lang.Class.*;
import static java.sql.DriverManager.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementClass {
	public static void main(String... command) throws ClassNotFoundException,
			SQLException {
		// CRUD operation
		forName("com.mysql.jdbc.Driver");// Driver is loaded over here
		Connection connection = getConnection(
				"jdbc:mysql://localhost:3306/dbexample1_db", "root",
				"1212Sophy");
		// Extablish connection between Driver and Database Engine
		Statement statement = connection.createStatement();
		// Use Statement object or PreparedStatement object, CallableStatement
		// Object
		ResultSet resultset = statement
				.executeQuery("SELECT * FROM dbexample1_db.userorder where OrderID = ?");
		// ? are used as the placeholder for the parameter
	
		while(resultset.next())
		{
				out.println( resultset.getString("OrderID")+"  "+resultset.getString("Title")+""
						+ "  "+resultset.getString("userID"));
		}
	
		// Put value into database
		//insert into dbexample1_db.userorder values ('1234566','Ghajani','56245634');
		statement.executeUpdate("insert into dbexample1_db.userorder values ('1234567','Tare zameen Par','56241234')");
		
		
		statement.close();
		connection.close();
	}
	
	
}
