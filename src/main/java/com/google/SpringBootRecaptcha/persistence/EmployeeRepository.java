package com.google.SpringBootRecaptcha.persistence;

import com.google.SpringBootRecaptcha.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {
}
