package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.manash.bo.DeptBO;

public class DeptDAOImp implements DeptDAO {
	private static final String GET_DPET="SELECT * FROM DEPT WHERE DEPTNO=?";
	private DataSource ds;

	public DeptDAOImp(DataSource ds) {
		this.ds = ds;
	}

	public List<DeptBO> searchByDeptNo(int deptno) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<DeptBO> listBO=new ArrayList<DeptBO>();
		DeptBO bo=null;
		try {
			//get Connection object from connection pool
			con=ds.getConnection();
			//Prepare prepared statement object
			ps=con.prepareStatement(GET_DPET);
			//set values in pre compiled query
			ps.setInt(1,deptno);
			//send and execute the pre compiled query
			rs=ps.executeQuery();
			while(rs.next()) {
				bo=new DeptBO();
				bo.setDeptNo(rs.getInt(1));
				bo.setDeptName(rs.getString(2));
				bo.setLoc(rs.getString(3));
				listBO.add(bo);
			}//while
			
		}//try
		catch(SQLException se) {
			se.getMessage();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listBO;
	}

}
