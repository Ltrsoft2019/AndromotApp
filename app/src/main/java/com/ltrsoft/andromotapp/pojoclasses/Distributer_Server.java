package com.ltrsoft.andromotapp.pojoclasses;

public class Distributer_Server {

    private int distributer_server_id;
    private int distributer_id;
    private int server_id;

    public Distributer_Server(int distributer_server_id, int distributer_id, int server_id) {
        this.distributer_server_id = distributer_server_id;
        this.distributer_id = distributer_id;
        this.server_id = server_id;
    }

    public int getDistributer_server_id() {
        return distributer_server_id;
    }

    public void setDistributer_server_id(int distributer_server_id) {
        this.distributer_server_id = distributer_server_id;
    }

    public int getDistributer_id() {
        return distributer_id;
    }

    public void setDistributer_id(int distributer_id) {
        this.distributer_id = distributer_id;
    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }
}
