package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.SerializedName;

public class RegisterResponsePojo {
    @SerializedName("status")
    private String status;

    @SerializedName("user_id")
    private String user_id;

    public RegisterResponsePojo(String status, String user_id) {
        this.status = status;
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
