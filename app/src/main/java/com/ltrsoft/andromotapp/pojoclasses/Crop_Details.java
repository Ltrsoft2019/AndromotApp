package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.SerializedName;

public class Crop_Details {
    @SerializedName("crop_id")
    int crop_id;
    @SerializedName("crop_name")
    String crop_name;
    @SerializedName("description")
    String description;
    @SerializedName("required_threshold_value")
    String required_threshold_value;
    @SerializedName("device_name")
    String device_name;
    @SerializedName("crop_image")
    String crop_image;

    public Crop_Details() {
    }

    public Crop_Details(int crop_id, String crop_name, String description, String crop_image, String required_threshold_value) {
        this.crop_id = crop_id;
        this.crop_name = crop_name;
        this.description = description;
        this.crop_image = crop_image;
        this.required_threshold_value = required_threshold_value;
    }

    //This constructor use for "Crop_Suggestion" Recyclerview...
//    public Crop_Details(String crop_name, String device_name, String crop_image) {
//        this.crop_name = crop_name;
//        this.device_name = device_name;
//        this.crop_image = crop_image;
//    }

    //This constructor use for "Add Crop" Recyclerview...
    public Crop_Details(String  crop_image , String crop_name, String description ) {
        this.crop_image = crop_image;
        this.crop_name = crop_name;
        this.description = description;
    }

    //    public Crop_Details( String crop_image,String crop_name) {
//        this.crop_name = crop_name;
//        this.crop_image = crop_image;
//    }

    public int getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(int crop_id) {
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

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public void setRequired_threshold_value(String required_threshold_value) {
        this.required_threshold_value = required_threshold_value;
    }
}
