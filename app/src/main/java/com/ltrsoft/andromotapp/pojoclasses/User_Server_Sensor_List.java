package com.ltrsoft.andromotapp.pojoclasses;

public class User_Server_Sensor_List {

    String server_sensor_id,server_sensor_name_id,server_status,user_id;

    public User_Server_Sensor_List(String server_sensor_id, String server_sensor_name_id, String server_status, String user_id) {
        this.server_sensor_id = server_sensor_id;
        this.server_sensor_name_id = server_sensor_name_id;
        this.server_status = server_status;
        this.user_id = user_id;
    }

    public String getServer_sensor_id() {
        return server_sensor_id;
    }

    public void setServer_sensor_id(String server_sensor_id) {
        this.server_sensor_id = server_sensor_id;
    }

    public String getServer_sensor_name_id() {
        return server_sensor_name_id;
    }

    public void setServer_sensor_name_id(String server_sensor_name_id) {
        this.server_sensor_name_id = server_sensor_name_id;
    }

    public String getServer_status() {
        return server_status;
    }

    public void setServer_status(String server_status) {
        this.server_status = server_status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
