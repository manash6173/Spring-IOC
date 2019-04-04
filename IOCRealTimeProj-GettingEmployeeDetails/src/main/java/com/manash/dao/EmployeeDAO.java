package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import com.manash.bo.EmployeeBO;

public class EmployeeDAO {
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	private PreparedStatement ps;
	private Connection con;
	private ResultSet rs;
	private static final String GET_EMPLOYEE="SELECT ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	public List<EmployeeBO> searchDesg(String desg) throws SQLException {
		List<EmployeeBO> listBO=null;
		//establish connection to DB s/w
		con=ds.getConnection();
		//create preparedStatement object
		ps=con.prepareStatement(GET_EMPLOYEE);
		//set values in pre-compile prepared statement object
		ps.setString(1,desg);
		//send and execute the query
		rs=ps.executeQuery();
		//gather result from resultset object
		listBO=new ArrayList();
		while(rs.next()) {
			EmployeeBO empbo=new EmployeeBO();
			empbo.setEname(rs.getString(1));
			empbo.setDesg(rs.getString(2));
			empbo.setSalary(rs.getInt(3));
			listBO.add(empbo);
		}
		/*Iterator<?> it=listBO.iterator();
		while(it.hasNext()) {
			EmployeeBO empbo=(EmployeeBO) it.next();
			System.out.println(empbo.getEname()+" "+empbo.getDesg()+"  "+empbo.getSalary());
		}*/
		return listBO;
	}

}
