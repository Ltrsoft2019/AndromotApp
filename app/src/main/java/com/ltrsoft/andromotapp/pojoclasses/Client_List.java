package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Field;

public class Client_List {


    private int client_id;
    @SerializedName("client_name_id")
    private String  client_name_id;
    @SerializedName("client_manufacture_date")
    private String client_manufacture_date;
    @SerializedName("client_description")
    private String client_description;

    public Client_List(int client_id, String client_name_id, String client_manufacture_date, String client_description) {
        this.client_id = client_id;
        this.client_name_id = client_name_id;
        this.client_manufacture_date = client_manufacture_date;
        this.client_description = client_description;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String  getClient_name_id() {
        return client_name_id;
    }

    public void setClient_name_id(String  client_name_id) {
        this.client_name_id = client_name_id;
    }

    public String getClient_manufacture_date() {
        return client_manufacture_date;
    }

    public void setClient_manufacture_date(String client_manufacture_date) {
        this.client_manufacture_date = client_manufacture_date;
    }

    public String getClient_description() {
        return client_description;
    }

    public void setClient_description(String client_description) {
        this.client_description = client_description;
    }
}
