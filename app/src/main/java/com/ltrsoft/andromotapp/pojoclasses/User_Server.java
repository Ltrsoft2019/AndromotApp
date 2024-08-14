package com.ltrsoft.andromotapp.pojoclasses;

public class User_Server {

    private int user_server_id;
    private int user_id;
    private int distributer_server_id;
    private String server_status;
    private String server_warranty_duration_months;
    private String server_warranty_end_date;
    private String is_server_changed;

    public User_Server(int user_server_id, int user_id, int distributer_server_id, String server_status, String server_warranty_duration_months, String server_warranty_end_date, String is_server_changed) {
        this.user_server_id = user_server_id;
        this.user_id = user_id;
        this.distributer_server_id = distributer_server_id;
        this.server_status = server_status;
        this.server_warranty_duration_months = server_warranty_duration_months;
        this.server_warranty_end_date = server_warranty_end_date;
        this.is_server_changed = is_server_changed;
    }

    public int getUser_server_id() {
        return user_server_id;
    }

    public void setUser_server_id(int user_server_id) {
        this.user_server_id = user_server_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDistributer_server_id() {
        return distributer_server_id;
    }

    public void setDistributer_server_id(int distributer_server_id) {
        this.distributer_server_id = distributer_server_id;
    }

    public String getServer_status() {
        return server_status;
    }

    public void setServer_status(String server_status) {
        this.server_status = server_status;
    }

    public String getServer_warranty_duration_months() {
        return server_warranty_duration_months;
    }

    public void setServer_warranty_duration_months(String server_warranty_duration_months) {
        this.server_warranty_duration_months = server_warranty_duration_months;
    }

    public String getServer_warranty_end_date() {
        return server_warranty_end_date;
    }

    public void setServer_warranty_end_date(String server_warranty_end_date) {
        this.server_warranty_end_date = server_warranty_end_date;
    }

    public String getIs_server_changed() {
        return is_server_changed;
    }

    public void setIs_server_changed(String is_server_changed) {
        this.is_server_changed = is_server_changed;
    }
}
