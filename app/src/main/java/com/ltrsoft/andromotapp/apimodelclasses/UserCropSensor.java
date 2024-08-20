package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.User_Crop_Sensor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserCropSensor {

    @FormUrlEncoded
    @POST("create_user_crop_sensor.php")
    Call<User_Crop_Sensor> createUserCropSensor(
            @Field("user_crop_sensor_id") String userCropSensorId,
            @Field("crop_id") String cropId,
            @Field("sensor_client_id") String sensorClientId,
            @Field("date_of_plant") String dateOfPlant,
            @Field("threshold_value") String thresholdValue,
            @Field("user_id") String userId
    );

    @FormUrlEncoded
    @POST("update_user_crop_sensor.php")
    Call<User_Crop_Sensor> updateUserCropSensor(
            @Field("user_crop_sensor_id") String userCropSensorId,
            @Field("crop_id") String cropId,
            @Field("sensor_client_id") String sensorClientId,
            @Field("date_of_plant") String dateOfPlant,
            @Field("threshold_value") String thresholdValue,
            @Field("user_id") String userId
    );

    @FormUrlEncoded
    @POST("delete_user_crop_sensor.php")
    Call<User_Crop_Sensor> deleteUserCropSensor(
            @Field("user_crop_sensor_id") String userCropSensorId,
            @Field("crop_id") String cropId,
            @Field("sensor_client_id") String sensorClientId,
            @Field("date_of_plant") String dateOfPlant,
            @Field("threshold_value") String thresholdValue,
            @Field("user_id") String userId
    );

    @GET("readall_user_crop_sensor.php")
    Call<List<User_Crop_Sensor>> readAllUserCropSensor();

    @GET("read_user_crop_sensor.php")
    Call<User_Crop_Sensor> read_by_idUserCropSensor(
            @Field("user_crop_sensor_id") String userCropSensorId
    );
}
