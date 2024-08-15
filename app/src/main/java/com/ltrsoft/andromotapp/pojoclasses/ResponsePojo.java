package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.SerializedName;

public class ResponsePojo {
    @SerializedName("status")
    private String status;

    public ResponsePojo(String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
