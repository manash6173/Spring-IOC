package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.manash.bo.EmployeeBO;

public class EmployeeDAOImp implements EmployeeDAO {
	private static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private DataSource ds;

	public EmployeeDAOImp(DataSource ds) {
		this.ds = ds;
	}

	public List<EmployeeBO> searchEmployeeByDesg(String desg) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		EmployeeBO bo = null;
		List<EmployeeBO> listBO = null;
		try {
			// Getting connection object from connection pool
			con = ds.getConnection();
			// create prepared statement object
			ps = con.prepareStatement(GET_EMP_BY_DESG);
			// set values in preparedStatement object
			ps.setString(1, desg);
			// send and execute the pre-compiled query
			rs = ps.executeQuery();
			// gather result from resultset object
			listBO = new ArrayList<EmployeeBO>();
			while (rs.next()) {
				// transfer result set object data to employee object
				bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEmpName(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				// add EmployeeBO object data into List collection
				listBO.add(bo);
				System.out.println(ds.getClass());
			}

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		return listBO;
	}

}
