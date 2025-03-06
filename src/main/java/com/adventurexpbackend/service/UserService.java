package com.adventurexpbackend.service;

import com.adventurexpbackend.model.UserModel;
import com.adventurexpbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserModel> getAllUsers() {
        return repository.findAll();
    }

    public UserModel createUser(UserModel user) {
        return repository.save(user);
    }

    public UserModel getUserById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}

