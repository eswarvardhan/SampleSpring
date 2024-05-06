package com.example.learn.Interfaces;

import org.springframework.http.ResponseEntity;
import com.example.learn.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface Employees {
    @GetMapping("/getEmployees")
    ResponseEntity<List<Employee>> getEmployees();
    @GetMapping("/getEmployee/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id);
    @PostMapping("/addEmployee")
    ResponseEntity<String> addEmployee(@RequestBody Employee emp);
}
