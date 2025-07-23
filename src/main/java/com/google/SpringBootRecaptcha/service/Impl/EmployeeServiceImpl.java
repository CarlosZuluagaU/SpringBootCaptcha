// src/main/java/com/google.SpringBootRecaptcha/service/Impl/EmployeeServiceImpl.java
package com.google.SpringBootRecaptcha.service.Impl;

import com.google.SpringBootRecaptcha.entities.EmployeeEntity;
import com.google.SpringBootRecaptcha.persistence.EmployeeRepository; // Asegúrate de que este import sea correcto
import com.google.SpringBootRecaptcha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Implementar la interfaz

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void createEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);

    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);

    }
}
