package com.cg.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entities.Department;

@Repository
public interface ICustomDeptRepository extends JpaRepository<Department, Integer> {
	
}
