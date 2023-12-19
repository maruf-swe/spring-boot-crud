package com.basicscrud.Springboot.tutorial.service;

import com.basicscrud.Springboot.tutorial.entity.Department;
import com.basicscrud.Springboot.tutorial.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    ModelMapper mapper = new ModelMapper();

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDeparmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department newDepartmentInfo) {
        Department existingDepartmentInfo = departmentRepository.findById(departmentId).get();
        mapper.map(newDepartmentInfo, existingDepartmentInfo);
        return departmentRepository.save(existingDepartmentInfo);

    }

    @Override
    public ResponseEntity<Department> updateDepartmentInfo(Long departmentId, Department departmentNewInfo) {
        Optional<Department> existingDepartment = departmentRepository.findById(departmentId);
        if (existingDepartment.isPresent()) {
            mapper.map(departmentNewInfo, existingDepartment.get());
            return new ResponseEntity<>(departmentRepository.save(existingDepartment.get()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public Department getDepartmentByProperty(String propertyName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(propertyName);

    }


}
