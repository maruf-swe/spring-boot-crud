package com.basicscrud.Springboot.tutorial.controller;


import com.basicscrud.Springboot.tutorial.entity.Department;
import com.basicscrud.Springboot.tutorial.service.DepartmentService;
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
    public Department getDepartmentById(@PathVariable(name = "id") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);

    }

}
