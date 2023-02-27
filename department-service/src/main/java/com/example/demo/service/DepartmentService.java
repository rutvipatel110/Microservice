package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
