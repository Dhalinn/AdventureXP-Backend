package com.adventurexpbackend.service;

import com.adventurexpbackend.model.EmployeeModel;
import com.adventurexpbackend.model.EmployeeModel.Role;
import com.adventurexpbackend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<EmployeeModel> getAllEmployees() {
        return repository.findAll();
    }

    public List<EmployeeModel> getEmployeesByRole(Role role) {
        return repository.findByRole(role);
    }

    public EmployeeModel createEmployee(EmployeeModel employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
