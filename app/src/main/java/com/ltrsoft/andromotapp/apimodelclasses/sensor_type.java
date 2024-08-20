package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.User_Crop_Sensor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface sensor_type {


    @FormUrlEncoded
    @POST("create_sensor_type.php")
    Call<User_Crop_Sensor> createSensorType(
            @Field("sensor_type_id") String sensor_type_Id,
            @Field("sensor_type_name") String sensor_type_name,
            @Field("price") String price
    );

    @FormUrlEncoded
    @POST("update_sensor_type.php")
    Call<User_Crop_Sensor> updateSensorType(
            @Field("sensor_type_id") String sensor_type_Id,
            @Field("sensor_type_name") String sensor_type_name,
            @Field("price") String price
    );

    @FormUrlEncoded
    @POST("delete_sensor_type.php")
    Call<User_Crop_Sensor> deleteSensorType(
            @Field("sensor_type_id") String sensor_type_Id,
            @Field("sensor_type_name") String sensor_type_name,
            @Field("price") String price
    );


    @GET("readall_sensor_type.php")
    Call<List<sensor_type>> readAllsensor_type();

    @GET("read_sensor_type.php")
    Call<sensor_type> read_by_id_sensor_type(
            @Field("sensor_type_id") String sensor_type_Id
    );




}
