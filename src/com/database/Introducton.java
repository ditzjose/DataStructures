package com.database;

public class Introducton {	
/*
 Steps for the JDBC to work :
  	-Load and register the dirver(class.forName("Driver name")). By doing this the perticular class will be 
  	loaded to the library.Then JVM could pick up the perticular byte code for execution.In this Driver it 
  	will have a static method called getConnection("Schema name","User","assword");
  	Connection con = DriverManager.getConnection();
  	-Connect the the Driver that is connect to the appilication to the DataBase engine
  	-Declare and Intialize Statements,PreparedStatement and CallableStatements as per application requirement.
  	Statement object the performance is very low.
  	If all queries are exequted independently then go for Statments.
  	Hence for each statements in the Database Engine side Tokeniztion,Parsing,Optimization,Execution wil happen.
  	When multiple repitative querise are there then for better performance use Prepared Statements.
  	1 time execution of all phase in database engine will  happen in the case of PreparedStatement.
  	To access all the stored Procedure use CallableStatments.
  	Statemet st = con.createstement();
  	-Write and execute the sql queries.
  	ResultSet rs = st.executeQuery("Select statement"); to execte select execute queries
  	st.executeUpdate() to execute DML statements
  	st.exceuteUpdate("Update statemnts");
  	st.execute() to execute both the queries
  	-Close the statements
  	-Close the connection 
  	
  	
JDBC is a framework or API that has predefined classes or interfaces thta produces a environment to
communicate with the database.


Datbase engine is connected to any Database.
In the database engine:
		-Query Tokenization- Divides the query into different pieces. Each piece is called as Tokens.
		-Query Parsing- This stream of tokens will be given as input to Query Parsing. It can be to 
		check all kind of error(Syntax erro,lexical error) in the provided sl query.  
		-Query Optimization- Query Parsing will give a tree structure to uery Optimization phase.
		Query optimization willl apply alogorithms of Query Parsing to reduce execution time.
		-Query Execution- Finaly the uery execution will happen.
 */
}
