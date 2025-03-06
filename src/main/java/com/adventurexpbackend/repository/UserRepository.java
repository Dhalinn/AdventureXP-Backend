package com.adventurexpbackend.repository;
import com.adventurexpbackend.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long>{
}
