package com.sepience.particlesimulationplatform.entities;

import org.springframework.web.multipart.MultipartFile;

public class SimulationDto {
    private int id;

    private String name;

    private MultipartFile file;

    private String uploadedBy;

    public SimulationDto(int id, String name, MultipartFile file, String uploadedBy) {
        this.id = id;
        this.name = name;
        this.file = file;
        this.uploadedBy = uploadedBy;
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

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }
}
