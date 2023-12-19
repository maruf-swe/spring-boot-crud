package com.basicscrud.Springboot.tutorial.controller;


import com.basicscrud.Springboot.tutorial.entity.Department;
import com.basicscrud.Springboot.tutorial.service.DepartmentService;
import org.springframework.http.HttpStatus;
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


    // Another solution using ResponseEntity
    @PutMapping("/department/{id}")
    public ResponseEntity<Department>  updateDepartments(@PathVariable(name = "id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartmentInfo(departmentId, department);
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByProperty(@PathVariable(name = "name") String propertyName){
        return departmentService.getDepartmentByProperty(propertyName);
    }

}
