package com.example.learn.Repository;

import com.example.learn.Model.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
