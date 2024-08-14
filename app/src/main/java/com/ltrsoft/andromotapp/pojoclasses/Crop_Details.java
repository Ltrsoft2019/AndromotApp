package com.ltrsoft.andromotapp.pojoclasses;

public class Crop_Details {
    String crop_id,crop_name, description, required_threshold_value;
    String crop_image;

    public Crop_Details() {
    }

    public Crop_Details(String crop_id, String crop_name, String description, String crop_image, String required_threshold_value) {
        this.crop_id = crop_id;
        this.crop_name = crop_name;
        this.description = description;
        this.crop_image = crop_image;
        this.required_threshold_value = required_threshold_value;
    }

//    public Crop_Details( String crop_image,String crop_name) {
//        this.crop_name = crop_name;
//        this.crop_image = crop_image;
//    }

    public String getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(String crop_id) {
        this.crop_id = crop_id;
    }

    public String getCrop_name() {
        return crop_name;
    }

    public void setCrop_name(String crop_name) {
        this.crop_name = crop_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequired_threshold_value() {
        return required_threshold_value;
    }

    public String getCrop_image() {
        return crop_image;
    }

    public void setCrop_image(String crop_image) {
        this.crop_image = crop_image;
    }

    public void setRequired_threshold_value(String required_threshold_value) {
        this.required_threshold_value = required_threshold_value;
    }
}
