package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Manager;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Server_List_api {
    @FormUrlEncoded
    @POST("create_server_list.php")
    Call<Server_List> create_Server_List(
            @Field("server_manufacture_date") int server_manufacture_date,
            @Field("server_name_id") String  server_name_id,
            @Field("server_status") String server_status,
            @Field("server_description") String server_description
    );
    @FormUrlEncoded
    @POST("update_server_list.php")
    Call<Server_List> update_Server_List(
            @Field("server_id") int server_id,
            @Field("user_id") int user_id,
            @Field("server_manufacture_date") int server_manufacture_date,
            @Field("server_name_id") String  server_name_id,
            @Field("server_status") String server_status,
            @Field("server_description") String server_description
    );
    @GET("read_by_user.php")
    Call<Server_List> read_by_id_Server_List(
            @Field("server_id") int server_id    );

    @GET("read_server_list.php")
    Call<List<Server_List>> readall_Server_List();

    @POST("delete_server_list.php")
    Call<Server_List> delete_Server_List(
            @Field("server_id") int server_id
    );
}





