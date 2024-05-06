package com.example.learn.MockData;

import com.example.learn.Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMockData {
    Employee e1 = new Employee("Alpha",1,50000);
    Employee e2 = new Employee("Beta",2,10000);
    Employee e3 = new Employee("Gaama",3,90000);
    public List<Employee> getEmployees(){
        return List.of(e1,e2,e3);
    }



}
