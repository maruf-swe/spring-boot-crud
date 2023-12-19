package com.basicscrud.Springboot.tutorial.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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


}

