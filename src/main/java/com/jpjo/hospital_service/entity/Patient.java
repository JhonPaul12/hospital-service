package com.jpjo.hospital_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "patient")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id 
    @Column(name = "pat_id")
    private Short id;

    @Column(name = "pat_name", length = 50)
    private String name;

    @Column(name = "pat_lastname", length = 50)
    private String lastname;

    @Column(name = "pat_username", length = 50)
    private String username;

    @Column(name = "pat_password")
    private String password;

    @Column(name = "pat_ci")
    private Short ci;

    @Column(name = "pat_state")
    private Boolean state;

    @Column(name = "pat_created_at")
    private LocalDate createdAt;

    @Column(name = "pat_updated_at")
    private LocalDate updatedAt;

    @Column(name = "deactivated_at")
    private LocalDate deactivatedAt;

}
