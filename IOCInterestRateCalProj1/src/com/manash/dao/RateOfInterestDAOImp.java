package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.manash.bo.RateOfInterestBO;

public class RateOfInterestDAOImp implements RateOfInterestDAO {
	private static final String INTEREST_QUERY="INSERT INTO INTEREST_RATE VALUES(LOAN_NO.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertLoan(RateOfInterestBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int cnt=0;
		//get connection object from connection pool
		con=ds.getConnection();
		//create preparedStatement object
		ps=con.prepareStatement(INTEREST_QUERY);
		//set values In param of the query
		ps.setDouble(1,bo.getPrincipal());
		ps.setFloat(2,bo.getRate());
		ps.setFloat(3,bo.getTime());
		ps.setDouble(4,bo.getSi());
		ps.setDouble(5,bo.getCi());
		//send and execute the query
		cnt=ps.executeUpdate();
		//close JDBC objects
		ps.close();
		con.close();
		return cnt;
	}

}
