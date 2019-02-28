package com.detroitlabs.photoalbum.Model;

import java.time.LocalDate;

public class Photo {
    private String name;
    private LocalDate uploadedDate;
    private String location;
    private int photoId;

    public Photo(String name, LocalDate uploadedDate, String location, int photoId) {
        this.name = name;
        this.uploadedDate = uploadedDate;
        this.location = location;
        this.photoId = photoId;
    }

   public Photo(String name, String location, int photoId) {
        this.name = name;
        this.uploadedDate = uploadedDate;
        this.location = location;
        this.photoId = photoId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalDate uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
