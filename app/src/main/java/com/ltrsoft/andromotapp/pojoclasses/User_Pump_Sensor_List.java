package com.ltrsoft.andromotapp.pojoclasses;

public class User_Pump_Sensor_List {

    String pump_sensor_list,pump_sensor_name_id,pump_sensor_status,client_sensor_id,user_id;

    public User_Pump_Sensor_List(String pump_sensor_list, String pump_sensor_name_id, String pump_sensor_status, String client_sensor_id, String user_id) {
        this.pump_sensor_list = pump_sensor_list;
        this.pump_sensor_name_id = pump_sensor_name_id;
        this.pump_sensor_status = pump_sensor_status;
        this.client_sensor_id = client_sensor_id;
        this.user_id = user_id;
    }

    public String getPump_sensor_list() {
        return pump_sensor_list;
    }

    public void setPump_sensor_list(String pump_sensor_list) {
        this.pump_sensor_list = pump_sensor_list;
    }

    public String getPump_sensor_name_id() {
        return pump_sensor_name_id;
    }

    public void setPump_sensor_name_id(String pump_sensor_name_id) {
        this.pump_sensor_name_id = pump_sensor_name_id;
    }

    public String getPump_sensor_status() {
        return pump_sensor_status;
    }

    public void setPump_sensor_status(String pump_sensor_status) {
        this.pump_sensor_status = pump_sensor_status;
    }

    public String getClient_sensor_id() {
        return client_sensor_id;
    }

    public void setClient_sensor_id(String client_sensor_id) {
        this.client_sensor_id = client_sensor_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
