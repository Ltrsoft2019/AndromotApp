package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.User_Server_Sensor_List;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface User_Server_Sensor_List_api_ {

    @FormUrlEncoded
    @POST("create_user_server_sensor_list.php")
    Call<User_Server_Sensor_List> create_user_server_sensor_list_api(
            @Field("distributer_server_id") int distributer_id,
            @Field("server_id") int server_id,
            @Field("server_status") String server_status,
            @Field("user_id") int user_id
    );
    @FormUrlEncoded
    @POST("update_server_status.php")
    Call<User_Server_Sensor_List> update_user_server_sensor_list_api(
            @Field("server_sensor_name_id") int distributer_id,
            @Field("server_status") int distributer_cock_id,
            @Field("user_id") int user_id

    );
    @FormUrlEncoded
    @POST("update_user_server_sensor_list.php")
    Call<User_Server_Sensor_List> update_user_server_sensor_list_api(
            @Field("user_sever_sensor_id") int distributer_id,
            @Field("distributer_server_id") int distributer_cock_id,
            @Field("server_id_")int cock_id,
            @Field("server_status") String server_status,
            @Field("user_id")int user_id

            );
    @GET("by_user_id.php")
    Call<User_Server_Sensor_List> read_by_id_user_id(
            @Field("user_id") int user_id
    );
    @GET(" by_name_server_sensor_list.php")
    Call<User_Server_Sensor_List>read_by_name_server_sensor_name_id(
            @Field("server_sensor_name_id ")int server_sensor_name_id
    );
    @GET(" read_user_server_sensor_list.php")
    Call<User_Server_Sensor_List>read_by_user_server_sensor_list(
            @Field("server_sensor_name_id ")String server_sensor_name_id
    );


    @GET("readall_user_server_sensor_list.php")
    Call<List<User_Server_Sensor_List>> read_all_user_server_sensor_list_api();

    @POST("delete_distributer_cock.php ")
    Call<User_Server_Sensor_List> delete_by_id_user_server_sensor_list_api(
            @Field("user_server_sensor_id") int distributer_cock_id
    );
}


