package com.adventurexpbackend.controller;

import com.adventurexpbackend.model.EmployeeModel;
import com.adventurexpbackend.model.EmployeeModel.Role;
import com.adventurexpbackend.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeModel> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/role/{role}")
    public List<EmployeeModel> getEmployeesByRole(@PathVariable Role role) {
        return service.getEmployeesByRole(role);
    }

    @PostMapping
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employee) {
        return service.createEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
}

