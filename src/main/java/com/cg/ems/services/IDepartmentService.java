package com.cg.ems.services;

import java.util.List;
import com.cg.ems.entities.Department;

public interface IDepartmentService {
	void addDepartment(String dname);
	List<Department> getAllDepartments();
	List<Department> getAllDepartByPagination(String maxPage, String ofset);
	int getAllDepartCount();
	boolean deleteDepartment(int id);
}
