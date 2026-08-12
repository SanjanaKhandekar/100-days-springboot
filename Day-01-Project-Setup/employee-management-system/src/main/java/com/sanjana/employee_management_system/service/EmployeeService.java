package com.sanjana.employee_management_system.service;

import com.sanjana.employee_management_system.model.Employee;
import com.sanjana.employee_management_system.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployee() {
        return new Employee(1L, "Sanjana", "Java Developer");
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}