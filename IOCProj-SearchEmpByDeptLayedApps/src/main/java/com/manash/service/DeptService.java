package com.manash.service;

import java.util.List;

import com.manash.dto.DeptDTO;

public interface DeptService {
	public List<DeptDTO> foundByDeptNo(int deptno)throws Exception;
}
