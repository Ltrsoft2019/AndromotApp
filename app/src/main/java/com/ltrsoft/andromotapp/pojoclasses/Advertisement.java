package com.ltrsoft.andromotapp.pojoclasses;

public class Advertisement {
    String advertisement_id, title,description, images;

    public Advertisement() {
    }

    public Advertisement(String advertisement_id, String title, String description, String images) {
        this.advertisement_id = advertisement_id;
        this.title = title;
        this.description = description;
        this.images = images;
    }

    public String getAdvertisement_id() {
        return advertisement_id;
    }

    public void setAdvertisement_id(String advertisement_id) {
        this.advertisement_id = advertisement_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
