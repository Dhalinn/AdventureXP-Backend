package com.adventurexpbackend.controller;

import com.adventurexpbackend.model.ActivityModel;
import com.adventurexpbackend.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {
    private final ActivityService service;

    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @GetMapping
    public List<ActivityModel> getAllActivities() {
        return service.getAllActivities();
    }

    @PostMapping
    public ActivityModel createActivity(@RequestBody ActivityModel activity) {
        return service.createActivity(activity);
    }

    @GetMapping("/{id}")
    public ActivityModel getActivityById(@PathVariable Long id) {
        return service.getActivityById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable Long id) {
        service.deleteActivity(id);
    }
}
