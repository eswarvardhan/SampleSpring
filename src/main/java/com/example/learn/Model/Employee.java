package com.example.learn.Model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Employee {

    public Employee(String name, int id, long salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee(){

    }
    @Nonnull
    @Column(unique = true)
    private String name;
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private int id;
    @Nonnull
    private long salary;

}
