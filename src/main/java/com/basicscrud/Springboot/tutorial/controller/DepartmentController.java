package com.basicscrud.Springboot.tutorial.controller;


import com.basicscrud.Springboot.tutorial.entity.Department;
import com.basicscrud.Springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> getDepartmentList() {
        return departmentService.getDeparmentList();
    }
    
    @GetMapping("/department/{id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable(name = "id") long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

}
