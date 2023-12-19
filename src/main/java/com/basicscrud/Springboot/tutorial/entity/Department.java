package com.basicscrud.Springboot.tutorial.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    private String departmentName;
//    @NotBlank(message = "Please Add Department Name")
//    @Length(max = 10, min = 3)
//    @Email                               // all are hibernate validation. all annotation are available
//    @Positive
//    @PositiveOrZero

    private Long departmentAddress;
    private Long departmentCode;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(Long departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public Long getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Long departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Department(Long departmentId, String departmentName, Long departmentAddress, Long departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName=" + departmentName +
                ", departmentAddress=" + departmentAddress +
                ", departmentCode=" + departmentCode +
                '}';
    }
}

