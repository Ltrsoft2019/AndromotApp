package com.ltrsoft.andromotapp.pojoclasses;

public class User_Client_Sensor_List {

    String sensor_list_id,sensor_name_id,sensor_value,sensor_status,user_id,server_sensor_id;

    public User_Client_Sensor_List(String sensor_list_id, String sensor_name_id, String sensor_value, String sensor_status, String user_id, String server_sensor_id) {
        this.sensor_list_id = sensor_list_id;
        this.sensor_name_id = sensor_name_id;
        this.sensor_value = sensor_value;
        this.sensor_status = sensor_status;
        this.user_id = user_id;
        this.server_sensor_id = server_sensor_id;
    }

    public String getSensor_list_id() {
        return sensor_list_id;
    }

    public void setSensor_list_id(String sensor_list_id) {
        this.sensor_list_id = sensor_list_id;
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

    public String getSensor_status() {
        return sensor_status;
    }

    public void setSensor_status(String sensor_status) {
        this.sensor_status = sensor_status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getServer_sensor_id() {
        return server_sensor_id;
    }

    public void setServer_sensor_id(String server_sensor_id) {
        this.server_sensor_id = server_sensor_id;
    }
}
