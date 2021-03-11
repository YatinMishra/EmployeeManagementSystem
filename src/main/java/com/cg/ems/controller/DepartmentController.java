package com.cg.ems.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.services.IDepartmentService;
import com.cg.ems.entities.Department;

@RestController
@RequestMapping(value="api/department")
public class DepartmentController {
	@Autowired
	private IDepartmentService departmentService;
	@GetMapping(value="/GetAllDepartment")
	public List<Department> getAllDepartment()
	{
	return	this.departmentService.getAllDepartments();
	}
	@GetMapping(value="/GetAllDepartmentByPage")
	public List<Department> getAllDepartByPagination(String maxPage, String ofset)
	{
	return	this.departmentService.getAllDepartByPagination(maxPage, ofset);
	}
	@GetMapping(value="/GetAllDepartmentByCount")
	public int getAllDepartCount()
	{
	return	this.departmentService.getAllDepartCount();
	}
	@PostMapping(value="/addDepartment")
    public	void addDepartment(String dname)
	{
		
	}
}
