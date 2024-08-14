package com.ltrsoft.andromotapp.pojoclasses;

public class Distributer_Client {

    private int distributer_client_id;
    private int distributer_id;
    private int client_id;

    public Distributer_Client(int distributer_client_id, int distributer_id, int client_id) {
        this.distributer_client_id = distributer_client_id;
        this.distributer_id = distributer_id;
        this.client_id = client_id;
    }

    public int getDistributer_client_id() {
        return distributer_client_id;
    }

    public void setDistributer_client_id(int distributer_client_id) {
        this.distributer_client_id = distributer_client_id;
    }

    public int getDistributer_id() {
        return distributer_id;
    }

    public void setDistributer_id(int distributer_id) {
        this.distributer_id = distributer_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
}
