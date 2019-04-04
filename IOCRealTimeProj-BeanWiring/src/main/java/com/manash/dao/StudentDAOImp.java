package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import com.manash.bo.StudentBO;

public final class StudentDAOImp implements StudentDAO {
	private static final String SPRING_STUDENT_INSERT="INSERT INTO STUDENT1 VALUES(SPRING_SNO.NEXTVAL,?,?,?,?)";
	private DataSource ds;
	private Connection con;
	private PreparedStatement ps;
	private int cnt;
	public StudentDAOImp(DataSource ds) {
		super();
		this.ds = ds;
	}
	public int studentInsert(StudentBO bo) throws Exception {
		//get JDBC connection object from connection pool;
		con=ds.getConnection();
		//create preparedStatement objects
		ps=con.prepareStatement(SPRING_STUDENT_INSERT);
		//set values IN parameter of preparedStatement
		ps.setString(1,bo.getSname());
		ps.setInt(2,bo.getTotal());
		ps.setFloat(3,bo.getAvg());
		ps.setString(4,bo.getResult());
		//process and gather result
		cnt=ps.executeUpdate();
		return cnt;
	}

}
