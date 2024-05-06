package com.example.learn.Controller;


import com.example.learn.Interfaces.Employees;
import com.example.learn.Model.Employee;
import com.example.learn.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController implements Employees {
    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public @ResponseBody ResponseEntity<List<Employee>> getEmployees(){
        return new ResponseEntity(empRepo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(String id) {
        return new ResponseEntity(empRepo.findById(Integer.valueOf(id)),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> addEmployee(Employee emp) {
        empRepo.save(emp);
        return new ResponseEntity<>("Added Successfully", HttpStatus.OK);
    }


}
