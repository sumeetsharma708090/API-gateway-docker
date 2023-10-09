package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repo.DepartmentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{

	private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


	@Override
	public Department getDepartmentById(int departmentId) {
		return departmentRepository.findById(departmentId).get();
	}
}
