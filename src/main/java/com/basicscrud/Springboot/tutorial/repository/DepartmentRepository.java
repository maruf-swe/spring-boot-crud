package com.basicscrud.Springboot.tutorial.repository;

import com.basicscrud.Springboot.tutorial.entity.Department;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
