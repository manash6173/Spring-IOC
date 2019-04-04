package com.manash.mod1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BeanTestWithPropertiesFile {

	public static void main(String[] args) {
		InputStream io=null;
		Properties props=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
		io=new FileInputStream("src/main/java/com/manash/commons/jdbc.properties");
		props=new Properties();
		props.load(io);
		//register driver class
		Class.forName(props.getProperty("jdbc.driverName"));
		//establish connection to db
		con=DriverManager.getConnection(props.getProperty("jdbc.url"),
				                         props.getProperty("jdbc.userName"),
				                           props.getProperty("jdbc.passWord"));
		//create statement object
		st=con.createStatement();
		//send and execute the sql query
		rs=st.executeQuery("SELECT COUNT(*) FROM EMP");
		while(rs.next()) {
			System.out.println("Employee Count is::"+rs.getInt(1));
		}	
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				st.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
	}//main
}//class
