package com.cg.ems.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentRepository implements IDepartmentRepository  {
@Autowired
ICustomDeptRepository repository;

}
