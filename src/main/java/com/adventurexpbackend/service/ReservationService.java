package com.adventurexpbackend.service;

import com.adventurexpbackend.model.ReservationModel;
import com.adventurexpbackend.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository repository;

    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<ReservationModel> getAllReservations() {
        return repository.findAll();
    }

    public ReservationModel createReservation(ReservationModel reservation) {
        return repository.save(reservation);
    }

    public void deleteReservation(Long id) {
        repository.deleteById(id);
    }
}
