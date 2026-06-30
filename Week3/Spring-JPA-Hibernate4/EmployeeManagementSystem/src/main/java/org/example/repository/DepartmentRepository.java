package org.example.repository;

import org.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findByName(String name);

    boolean existsByName(String name);

    @Query("SELECT d FROM Department d WHERE d.name LIKE %?1%")
    Optional<Department> searchDepartment(String keyword);
}