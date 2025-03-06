package com.adventurexpbackend.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ReservationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserModel user;

    @ManyToOne
    private ActivityModel activity;

    private LocalDateTime reservationTime;

    // Constructors
    public ReservationModel() {}

    public ReservationModel(UserModel user, ActivityModel activity, LocalDateTime reservationTime) {
        this.user = user;
        this.activity = activity;
        this.reservationTime = reservationTime;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserModel getUser() { return user; }
    public void setUser(UserModel user) { this.user = user; }

    public ActivityModel getActivity() { return activity; }
    public void setActivity(ActivityModel activity) { this.activity = activity; }

    public LocalDateTime getReservationTime() { return reservationTime; }
    public void setReservationTime(LocalDateTime reservationTime) { this.reservationTime = reservationTime; }
}

