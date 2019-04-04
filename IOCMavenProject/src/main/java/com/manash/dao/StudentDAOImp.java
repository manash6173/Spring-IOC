package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import com.manash.bo.StudentBO;

public final class StudentDAOImp implements StudentDAO {
	private static final String SPRING_STUDENT_INSERT="INSERT INTO STUDENT1 VALUES(?,?,?,?,?)";
	private DataSource ds;
	private Connection con;
	private PreparedStatement ps;
	private int cnt;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	public int studentInsert(StudentBO bo) throws Exception {
		//get JDBC connection object from connection pool;
		con=ds.getConnection();
		//create preparedStatement objects
		ps=con.prepareStatement(SPRING_STUDENT_INSERT);
		//set values IN parameter of preparedStatement
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setInt(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		//process and gather result
		cnt=ps.executeUpdate();
		return cnt;
	}

}
