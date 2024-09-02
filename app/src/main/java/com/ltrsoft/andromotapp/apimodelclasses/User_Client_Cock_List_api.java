package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.User_Client_Cock_List;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface User_Client_Cock_List_api {

        @FormUrlEncoded
        @POST("user_client_cock_list/create_user_client_cock_list.php")
        Call<User_Client_Cock_List> createUserClientCockList(
                @Field("user_client_list_id") String user_client_list_id,
                @Field("distributer_client_id") String distributer_client_id,
                @Field("client_id") String client_id,
                @Field("client_moisture_value") String client_moisture_value,
                @Field("n_nitrogen") String n_nitrogen,
                @Field("p_phosphorus") String p_phosphorus,
                @Field("k_potassium") String k_potassium,
                @Field("client_status") String client_status,
                @Field("user_id") String user_id,
                @Field("client_warranty_end_date") String client_warranty_end_date,
                @Field("server_sensor_id") String server_sensor_id,
                @Field("distributer_cock_id") String distributer_cock_id,
                @Field("cock_id") String cock_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/update_client_cock_list.php")
        Call<User_Client_Cock_List> updateClientSensor(
                @Field("sensor_list_id") String sensor_list_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/update_sensor_value.php")
        Call<User_Client_Cock_List> updateSensorValue(
                @Field("sensor_name_id") String sensor_name_id,
                @Field("sensor_value") String sensor_value
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/update_server_by_client.php")
        Call<User_Client_Cock_List> updateServerByClient(
                @Field("sensor_list_id") String sensor_list_id,
                @Field("server_sensor_id") String server_sensor_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/update_server_status.php")
        Call<User_Client_Cock_List> updateServerStatus(
                @Field("server_sensor_name_id") String server_sensor_name_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/update_status.php")
        Call<User_Client_Cock_List> updateStatus(
                @Field("sensor_list_id") String sensor_list_id,
                @Field("sensor_status") String sensor_status
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/delete_client_cock_list.php")
        Call<User_Client_Cock_List> delete(
                @Field("sensor_list_id") String sensor_list_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/by_user_id.php")
        Call<List<User_Client_Cock_List>> readByUserId(
                @Field("user_id") String user_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/read_client_by_server_id.php")
        Call<List<User_Client_Cock_List>> readByServerId(
                @Field("server_sensor_id") String server_sensor_id
        );

        @FormUrlEncoded
        @POST("user_client_cock_list/read_client_cock_list.php")
        Call<User_Client_Cock_List> readSensorList(
                @Field("sensor_list_id") String sensor_list_id
        );

        @GET("user_client_cock_list/readall_client_cock_list.php")
        Call<List<User_Client_Cock_List>> readAll();

}
