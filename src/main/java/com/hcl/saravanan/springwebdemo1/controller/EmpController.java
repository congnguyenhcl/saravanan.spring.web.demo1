package com.hcl.saravanan.springwebdemo1.controller;

import com.hcl.saravanan.springwebdemo1.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class EmpController {
    @GetMapping("/emps")
    public List<Employee> getAllEmp() {
        return Arrays.asList(
                new Employee(100, "KP", "NY"),
                new Employee(101, "JL", "TX"));
    }
}
