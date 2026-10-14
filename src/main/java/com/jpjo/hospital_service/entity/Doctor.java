package com.jpjo.hospital_service.entity;

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
@Table (name = "doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id 
    @Column(name = "doc_id")
    private Short id;

    @Column(name = "doc_name", length = 50)
    private String name;

    @Column(name = "doc_lastname", length = 50)
    private String lastname;

    @Column(name = "doc_license_number")
    private String licenseNumber;

    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

}
