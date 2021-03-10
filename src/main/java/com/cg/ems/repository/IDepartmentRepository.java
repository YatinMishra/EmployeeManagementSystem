package com.cg.ems.repository;

import java.util.List;
import com.cg.ems.entities.Department;

public interface IDepartmentRepository {
	void addDepartment(String dname);
	List<Department> getAllDepartments();
	List<Department> getAllDepartByPagination(String maxPage, String ofset);
	int getAllDepartCount();
	boolean deleteDepartment(int id);
}
