package com.ltrsoft.andromotapp.pojoclasses;

public class User_Crop_Sensor_Pojo {
    String user_id,crop_id,crop_name,date_ucs,sensor_status,sensor_name_id,sensor_value,crop_image,sensor_list_id,threshold_value,description,user_crop_sensor_id;

    public User_Crop_Sensor_Pojo(String user_id, String crop_id, String crop_name, String sensor_status, String sensor_name_id,String sensor_value,
                                 String threshold_value,String sensor_list_id,String description,String crop_image,String date_ucs,String user_crop_sensor_id) {
        this.user_id = user_id;
        this.crop_id = crop_id;
        this.crop_name = crop_name;
        this.sensor_status = sensor_status;
        this.sensor_name_id = sensor_name_id;
        this.sensor_value = sensor_value;
        this.sensor_list_id = sensor_list_id;
        this.threshold_value = threshold_value;
        this.description = description;
        this.crop_image = crop_image;
        this.date_ucs = date_ucs;
        this.user_crop_sensor_id = user_crop_sensor_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

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

    public String getSensor_status() {
        return sensor_status;
    }

    public void setSensor_status(String sensor_status) {
        this.sensor_status = sensor_status;
    }

    public String getSensor_name_id() {
        return sensor_name_id;
    }

    public void setSensor_name_id(String sensor_name_id) {
        this.sensor_name_id = sensor_name_id;
    }

    public String getSensor_value() {
        return sensor_value;
    }
    public void setSensor_value(String sensor_value) {
        this.sensor_value = sensor_value;
    }


    public String getThreshold_value() {
        return threshold_value;
    }

    public void setThreshold_value(String threshold_value) {
        this.threshold_value = threshold_value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCrop_image() {
        return crop_image;
    }

    public void setCrop_image(String crop_image) {
        this.crop_image = crop_image;
    }

    public String getDate_ucs() {
        return date_ucs;
    }

    public String getSensor_list_id() {
        return sensor_list_id;
    }

    public void setSensor_list_id(String sensor_list_id) {
        this.sensor_list_id = sensor_list_id;
    }

    public String getUser_crop_sensor_id() {
        return user_crop_sensor_id;
    }

    public void setUser_crop_sensor_id(String user_crop_sensor_id) {
        this.user_crop_sensor_id = user_crop_sensor_id;
    }

    public void setDate_ucs(String date_ucs) {
        this.date_ucs = date_ucs;


    }
}

