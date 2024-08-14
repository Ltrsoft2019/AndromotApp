package com.ltrsoft.andromotapp.pojoclasses;

public class User_Client_Cock {

    private int user_clinet_id;
    private int user_id;
    private int distributer_client_id;
    private int server_id;
    private String client_status;
    private String client_warranty_duration_months;
    private String client_warranty_end_date;
    private int distributer_cock_id;
    private String is_client_changed;

    public User_Client_Cock(int user_clinet_id, int user_id, int distributer_client_id, int server_id, String client_status, String client_warranty_duration_months, String client_warranty_end_date, int distributer_cock_id, String is_client_changed) {
        this.user_clinet_id = user_clinet_id;
        this.user_id = user_id;
        this.distributer_client_id = distributer_client_id;
        this.server_id = server_id;
        this.client_status = client_status;
        this.client_warranty_duration_months = client_warranty_duration_months;
        this.client_warranty_end_date = client_warranty_end_date;
        this.distributer_cock_id = distributer_cock_id;
        this.is_client_changed = is_client_changed;
    }

    public int getUser_clinet_id() {
        return user_clinet_id;
    }

    public void setUser_clinet_id(int user_clinet_id) {
        this.user_clinet_id = user_clinet_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDistributer_client_id() {
        return distributer_client_id;
    }

    public void setDistributer_client_id(int distributer_client_id) {
        this.distributer_client_id = distributer_client_id;
    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }

    public String getClient_status() {
        return client_status;
    }

    public void setClient_status(String client_status) {
        this.client_status = client_status;
    }

    public String getClient_warranty_duration_months() {
        return client_warranty_duration_months;
    }

    public void setClient_warranty_duration_months(String client_warranty_duration_months) {
        this.client_warranty_duration_months = client_warranty_duration_months;
    }

    public String getClient_warranty_end_date() {
        return client_warranty_end_date;
    }

    public void setClient_warranty_end_date(String client_warranty_end_date) {
        this.client_warranty_end_date = client_warranty_end_date;
    }

    public int getDistributer_cock_id() {
        return distributer_cock_id;
    }

    public void setDistributer_cock_id(int distributer_cock_id) {
        this.distributer_cock_id = distributer_cock_id;
    }

    public String getIs_client_changed() {
        return is_client_changed;
    }

    public void setIs_client_changed(String is_client_changed) {
        this.is_client_changed = is_client_changed;
    }
}
