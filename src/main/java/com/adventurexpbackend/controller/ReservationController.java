package com.adventurexpbackend.controller;

import com.adventurexpbackend.model.ReservationModel;
import com.adventurexpbackend.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReservationModel> getAllReservations() {
        return service.getAllReservations();
    }

    @PostMapping
    public ReservationModel createReservation(@RequestBody ReservationModel reservation) {
        return service.createReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        service.deleteReservation(id);
    }
}
