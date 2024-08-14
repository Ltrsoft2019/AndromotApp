package com.ltrsoft.andromotapp.pojoclasses;

public class Sensor_Type {

    String sensor_type_id,sensor_type_name,price;

    public Sensor_Type(String sensor_type_id, String sensor_type_name, String price) {
        this.sensor_type_id = sensor_type_id;
        this.sensor_type_name = sensor_type_name;
        this.price = price;
    }

    public String getSensor_type_id() {
        return sensor_type_id;
    }

    public void setSensor_type_id(String sensor_type_id) {
        this.sensor_type_id = sensor_type_id;
    }

    public String getSensor_type_name() {
        return sensor_type_name;
    }

    public void setSensor_type_name(String sensor_type_name) {
        this.sensor_type_name = sensor_type_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
