package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Client_List;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Crop_Details_api {
    @FormUrlEncoded
    @POST("create_crop_detail.php")
    Call<Crop_Details> create_Crop_Details(
            @Field("crop_name") String crop_name ,
            @Field("description") String description ,
            @Field("required_threshold_value") String  required_threshold_value,
            @Field(" crop_image") int  client_description
    );
    @FormUrlEncoded
    @POST("update_crop_detail.php")
    Call<Crop_Details> update_Crop_Details(
            @Field("crop_name") String crop_name ,
            @Field("description") String description ,
            @Field("required_threshold_value") String  required_threshold_value,
            @Field(" crop_image") int  client_description,
            @Field("crop_id") int  crop_id
    );
    @POST("delete_crop_detail.php")
    Call<Crop_Details> delete_Crop_Details(
            @Field("crop_id") int  crop_id
    );
    @GET("id_crop_detail.php")
    Call<Crop_Details> read_by_id_Crop_Details(
            @Field("crop_id") int  crop_id
    );
    @GET("read_crop_detail.php")
    Call<List<Crop_Details>> read_Crop_Details();

    @GET("recent_crop.php")
    Call<List<Crop_Details>> recent_Crop_Details();
}



