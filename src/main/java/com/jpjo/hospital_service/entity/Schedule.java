package com.jpjo.hospital_service.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "schedule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id 
    @Column(name = "sch_id")
    private Short id;

    @Column(name = "sch_start_time")
    private LocalTime startTime;

    @Column(name = "sche_end_time")
    private LocalTime endTime;

    @Column(name = "sch_date")
    private LocalDate date;

    @Column(name = "sch_available")
    private Boolean available;

}
