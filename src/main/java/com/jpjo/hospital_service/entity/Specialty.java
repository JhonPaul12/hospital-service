package com.jpjo.hospital_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "specialty")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Specialty {
    @Id 
    @Column(name = "esp_id")
    private Short id;

    @Column(name = "esp_name", length = 50)
    private String name;

    @Column(name = "esp_description")
    private String description;

}
