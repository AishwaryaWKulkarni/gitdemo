package com.nimap.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Pattern(regexp = "[A-Za-z]*", message = "Emp Name should not contain  any space or special characters")
    private String empName;

    @NotNull
    private String empAddress;

    private double empSalary;

    @Range(min = 1000000000, max = 9999999999L, message = "ContactNo must be 10 digit")
    @Column(unique = true)
    private long empConatctNo;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDob;

    @Email(message = "Email Id must be valid")
    @Column(unique = true)
    private String empEmailId;

    @Size(min = 4, message = "Passowrd atlest of 4 characters")
    private String empPassword;
}
