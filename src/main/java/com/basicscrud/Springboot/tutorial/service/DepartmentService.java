package com.basicscrud.Springboot.tutorial.service;

import com.basicscrud.Springboot.tutorial.entity.Department;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getDeparmentList();


    public Department getDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    ResponseEntity<Department> updateDepartmentInfo(Long departmentId, Department department);

    public Department getDepartmentByProperty(String propertyName);
}
