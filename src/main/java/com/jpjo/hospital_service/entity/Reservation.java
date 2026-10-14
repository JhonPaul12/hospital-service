package com.jpjo.hospital_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id 
    @Column(name = "res_id")
    private Integer id;

    @Column(name = "res_state")
    private Boolean state;

    @Column(name = "res_date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "pat_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doc_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
}
