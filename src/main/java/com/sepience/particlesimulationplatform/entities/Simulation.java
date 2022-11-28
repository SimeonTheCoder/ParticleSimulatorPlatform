package com.sepience.particlesimulationplatform.entities;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import org.w3c.dom.Text;

@Entity
@Table(name = "simulations")
public class Simulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Column(nullable = false, columnDefinition = "MEDIUMTEXT")
    private String data;

    @Column(name = "uploaded_by")
    private String uploadedBy;

    public Simulation(String name, String data, String uploadedBy) {
        this.name = name;
        this.data = data;
        this.uploadedBy = uploadedBy;
    }

    public Simulation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }
}
