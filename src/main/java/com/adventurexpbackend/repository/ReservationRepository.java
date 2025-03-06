package com.adventurexpbackend.repository;



import com.adventurexpbackend.model.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationModel, Long> {}

