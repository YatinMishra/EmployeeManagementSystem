package com.cg.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.entities.Department;
import com.cg.ems.repository.IDepartmentRepository;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
	@Autowired
	private IDepartmentRepository repository;
	@Override
	public void addDepartment(String dname) {
		// TODO Auto-generated method stub
		repository.addDepartment(dname);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
	return	repository.getAllDepartments();
	}

	@Override
	public List<Department> getAllDepartByPagination(String maxPage, String ofset) {
		// TODO Auto-generated method stub
	return	repository.getAllDepartByPagination(maxPage, ofset);
	}

	@Override
	public int getAllDepartCount() {
		// TODO Auto-generated method stub
		return repository.getAllDepartCount();
	}

	@Override
	public boolean deleteDepartment(int id) {
		// TODO Auto-generated method stub
	//Department entity=repository.getOne(id);
		return repository.deleteDepartment(id);
	}
}
