package com.cognizant.ormlearn.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="skill")
public class Skill {

    @Id
    @Column(name="sk_id")
    private int id;

    @Column(name="sk_name")
    private String name;

    @ManyToMany(mappedBy="skillList")
    private List<Employee> employeeList;

    public Skill(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}