package com.cg.ems.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.services.IDepartmentService;
import com.capg.cba.entities.Customer;
import com.cg.ems.entities.Department;

@RestController
@RequestMapping(value="api/department")
public class DepartmentController {
	@Autowired
	private IDepartmentService departmentService;
	//to get the details of all department
	@GetMapping(value="/GetAllDepartment")
	public List<Department> getAllDepartment()
	{
	return	this.departmentService.getAllDepartments();
	}
	//to get the information of all department by pagination
	@GetMapping(value="/GetAllDepartmentByPage")
	public List<Department> getAllDepartByPagination(String maxPage, String ofset)
	{
	return	this.departmentService.getAllDepartByPagination(maxPage, ofset);
	}
	//get the details of all department by count
	@GetMapping(value="/GetAllDepartmentByCount")
	public int getAllDepartCount()
	{
	return	this.departmentService.getAllDepartCount();
	}
	//to add the department
	@PostMapping(value="/addDepartment")
    public	void addDepartment(String dname)
	{
		departmentService.addDepartment(dname);
	}
	//to delete a department
	@DeleteMapping(value = "/deleteCustomer/{cid}")
	public ResponseEntity<String> deleteDepartment(@PathVariable Integer id)
	{
		int department=departmentService.getAllDepartCount();
		departmentService.deleteDepartment(department);
		return new ResponseEntity<String>("Department With ID :"+id+" Deleted Successfully",HttpStatus.OK);
	}
	
}
