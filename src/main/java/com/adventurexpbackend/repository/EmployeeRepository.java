package com.adventurexpbackend.repository;

import com.adventurexpbackend.model.EmployeeModel;
import com.adventurexpbackend.model.EmployeeModel.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
    List<EmployeeModel> findByRole(Role role);
}
