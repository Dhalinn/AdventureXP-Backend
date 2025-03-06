package com.adventurexpbackend.service;

import com.adventurexpbackend.model.ActivityModel;
import com.adventurexpbackend.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {
    private final ActivityRepository repository;

    public ActivityService(ActivityRepository repository) {
        this.repository = repository;
    }

    public List<ActivityModel> getAllActivities() {
        return repository.findAll();
    }

    public ActivityModel createActivity(ActivityModel activity) {
        return repository.save(activity);
    }

    public ActivityModel getActivityById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Activity not found"));
    }

    public void deleteActivity(Long id) {
        repository.deleteById(id);
    }
}
