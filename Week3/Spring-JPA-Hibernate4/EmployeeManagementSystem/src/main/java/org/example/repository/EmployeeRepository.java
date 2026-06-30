package org.example.repository;

import org.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(name = "Employee.findAllEmployees")
    List<Employee> getAllEmployees();

    @Query(name = "Employee.findEmployeeByName")
    List<Employee> getEmployeeByName(String name);

}