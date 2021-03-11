package com.cg.ems.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.ems.entities.Department;

@Repository
public interface IDepartmentRepository {
	void addDepartment(String dname);
	List<Department> getAllDepartments();
	List<Department> getAllDepartByPagination(String maxPage, String ofset);
	int getAllDepartCount();
	boolean deleteDepartment(int id);
}
