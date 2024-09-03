package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.SerializedName;

public class CropPojo {
    @SerializedName("crop_image")
    private String crop_image;

    @SerializedName("crop_name")
    private String crop_name;

    @SerializedName("crop_id")
    private String crop_id;

    public String getCrop_image() {
        return crop_image;
    }

    public String getCrop_name() {
        return crop_name;
    }

    public String getCrop_id() {
        return crop_id;
    }
}
