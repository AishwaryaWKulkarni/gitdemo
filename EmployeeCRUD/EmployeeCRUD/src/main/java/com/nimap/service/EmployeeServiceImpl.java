package com.nimap.service;

import com.nimap.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepositoryImpl;


}
