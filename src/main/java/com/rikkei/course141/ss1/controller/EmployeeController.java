package com.rikkei.course141.ss1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.rikkei.course141.ss1.model.Employee;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @GetMapping
    public List<Employee> getAll() {
        return List.of(new Employee(1L, "A", 1000.0), new Employee(2L, "B", 1200.0));
    }
}
