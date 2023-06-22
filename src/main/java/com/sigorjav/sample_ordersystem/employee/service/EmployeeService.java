package com.sigorjav.sample_ordersystem.employee.service;

import com.sigorjav.sample_ordersystem.employee.dto.EmployeeDto;
import com.sigorjav.sample_ordersystem.employee.repository.EmployeeRepository;
import com.sigorjav.sample_ordersystem.employee.repository.entity.Employees;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public Employees registerEmployee(EmployeeDto employeeDto){
        Employees employees = Employees.builder().build();

        return employeeRepository.save(employees);
    }
}