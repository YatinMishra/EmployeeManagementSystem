package com.cg.ems.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.ems.entities.Department;

public class DepartmentRepository implements IDepartmentRepository  {
@Autowired
ICustomDeptRepository repository;

@Override
public void addDepartment(String dname) {
	// TODO Auto-generated method stub
	
}

@Override
public List<Department> getAllDepartments() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Department> getAllDepartByPagination(String maxPage, String ofset) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getAllDepartCount() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean deleteDepartment(int id) {
	// TODO Auto-generated method stub
	return false;
}

}
