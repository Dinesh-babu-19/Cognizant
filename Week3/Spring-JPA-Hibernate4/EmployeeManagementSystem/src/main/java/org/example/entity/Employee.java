package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")

@NamedQueries({

        @NamedQuery(
                name = "Employee.findAllEmployees",
                query = "SELECT e FROM Employee e"
        ),

        @NamedQuery(
                name = "Employee.findEmployeeByName",
                query = "SELECT e FROM Employee e WHERE e.name = :name"
        )

})

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}