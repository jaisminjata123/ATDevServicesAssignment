package com.example.employeecrudpostman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeecrudpostman.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
