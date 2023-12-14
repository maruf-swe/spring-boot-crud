package com.basicscrud.Springboot.tutorial.service;

import com.basicscrud.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDeparmentList();
}
