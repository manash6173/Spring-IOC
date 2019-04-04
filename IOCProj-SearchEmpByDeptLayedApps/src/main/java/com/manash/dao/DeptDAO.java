package com.manash.dao;

import java.util.List;

import com.manash.bo.DeptBO;

public interface DeptDAO {
	public List<DeptBO> searchByDeptNo(int deptno)throws Exception;
}
