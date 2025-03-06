package com.adventurexpbackend.repository;

import com.adventurexpbackend.model.ActivityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<ActivityModel, Long> {}
