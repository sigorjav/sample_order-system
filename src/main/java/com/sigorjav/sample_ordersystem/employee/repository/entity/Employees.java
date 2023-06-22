package com.sigorjav.sample_ordersystem.employee.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "employees")
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column (name = "employee_number")
    private Long employeeNumber;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "extension")
    private String extension;
    @Column (name = "email")
    private String email;
    @Column (name = "office_code")
    private String officeCode;
    @Column (name = "reports_to")
    private int reportsTo;
    @Column (name = "job_title")
    private String jobTitle;
}
