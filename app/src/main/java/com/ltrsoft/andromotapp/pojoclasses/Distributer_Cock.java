package com.ltrsoft.andromotapp.pojoclasses;

public class Distributer_Cock {

    private int distributer_cock_id;
    private int cock_id;
    private int distributer_id;

    public Distributer_Cock(int distributer_cock_id, int cock_id, int distributer_id) {
        this.distributer_cock_id = distributer_cock_id;
        this.cock_id = cock_id;
        this.distributer_id = distributer_id;
    }

    public int getDistributer_cock_id() {
        return distributer_cock_id;
    }

    public void setDistributer_cock_id(int distributer_cock_id) {
        this.distributer_cock_id = distributer_cock_id;
    }

    public int getCock_id() {
        return cock_id;
    }

    public void setCock_id(int cock_id) {
        this.cock_id = cock_id;
    }

    public int getDistributer_id() {
        return distributer_id;
    }

    public void setDistributer_id(int distributer_id) {
        this.distributer_id = distributer_id;
    }
}
