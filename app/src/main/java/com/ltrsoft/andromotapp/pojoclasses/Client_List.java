package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.http.Field;

public class Client_List {

        @SerializedName("client_id")
        @Expose
        private int clientId;

        @SerializedName("client_name_id")
        @Expose
        private String clientNameId;

        @SerializedName("client_manufacture_date")
        @Expose
        private String clientManufactureDate;

        @SerializedName("client_status")
        @Expose
        private String clientStatus;

        @SerializedName("client_description")
        @Expose
        private String clientDescription;

    public Client_List(int clientId, String clientNameId, String clientManufactureDate, String clientStatus, String clientDescription) {
        this.clientId = clientId;
        this.clientNameId = clientNameId;
        this.clientManufactureDate = clientManufactureDate;
        this.clientStatus = clientStatus;
        this.clientDescription = clientDescription;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientNameId() {
        return clientNameId;
    }

    public void setClientNameId(String clientNameId) {
        this.clientNameId = clientNameId;
    }

    public String getClientManufactureDate() {
        return clientManufactureDate;
    }

    public void setClientManufactureDate(String clientManufactureDate) {
        this.clientManufactureDate = clientManufactureDate;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getClientDescription() {
        return clientDescription;
    }

    public void setClientDescription(String clientDescription) {
        this.clientDescription = clientDescription;
    }

    public String  getClient_name_id() {
        return clientNameId;
    }
}
