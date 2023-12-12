package com.basicscrud.Springboot.tutorial.entity;

public class Department {

    private Long departmentId;
    private Long departmentName;
    private Long departmentAddress;
    private Long departmentCode;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Long departmentName) {
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
}
