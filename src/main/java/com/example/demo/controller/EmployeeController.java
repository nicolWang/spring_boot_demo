package com.example.demo.controller;

import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/all")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @RequestMapping("/{id}")
    public Employee findOne(@PathVariable("id") Integer id){
        return employeeService.findOne(id);
    }
}
