package com.basicscrud.Springboot.tutorial.controller;


import com.basicscrud.Springboot.tutorial.entity.Department;
import com.basicscrud.Springboot.tutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/save")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside the SaveDepartment Controller");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> getDepartmentList() {
        LOGGER.info("Inside the getDepartmentList Controller");
        return departmentService.getDeparmentList();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable(name = "id") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);

    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable(name = "id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Depertment delete successfully";

    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable(name = "id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }


    // Another updating solution using ResponseEntity
    @PutMapping("/departments/{id}")
    public ResponseEntity<Department> updateDepartments(@PathVariable(name = "id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartmentInfo(departmentId, department);
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByProperty(@PathVariable(name = "name") String propertyName) {
        return departmentService.getDepartmentByProperty(propertyName);
    }

}
