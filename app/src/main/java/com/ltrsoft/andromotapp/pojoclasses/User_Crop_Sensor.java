package com.ltrsoft.andromotapp.pojoclasses;

public class User_Crop_Sensor {

    String user_crop_sensor_id,crop_id,sensor_client_id,date_ucs,threshold_value,user_id,column_name,value;

    public User_Crop_Sensor(String user_crop_sensor_id, String crop_id, String sensor_client_id, String date_ucs, String threshold_value, String user_id) {
        this.user_crop_sensor_id = user_crop_sensor_id;
        this.crop_id = crop_id;
        this.sensor_client_id = sensor_client_id;
        this.date_ucs = date_ucs;
        this.threshold_value = threshold_value;
        this.user_id = user_id;
    }

    public String getUser_crop_sensor_id() {
        return user_crop_sensor_id;
    }

    public void setUser_crop_sensor_id(String user_crop_sensor_id) {
        this.user_crop_sensor_id = user_crop_sensor_id;
    }

    public String getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(String crop_id) {
        this.crop_id = crop_id;
    }

    public String getSensor_client_id() {
        return sensor_client_id;
    }

    public void setSensor_client_id(String sensor_client_id) {
        this.sensor_client_id = sensor_client_id;
    }

    public String getDate_ucs() {
        return date_ucs;
    }

    public void setDate_ucs(String date_ucs) {
        this.date_ucs = date_ucs;
    }

    public String getThreshold_value() {
        return threshold_value;
    }

    public void setThreshold_value(String threshold_value) {
        this.threshold_value = threshold_value;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
