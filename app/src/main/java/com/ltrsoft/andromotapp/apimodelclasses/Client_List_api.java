package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Client_List;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Client_List_api {
    @FormUrlEncoded
    @POST("create_client_list.php")
    Call<Client_List> create_Client_List(
            @Field("client_name_id") String client_name_id ,
            @Field("client_manufacture_date") String  client_manufacture_date ,
            @Field("client_status") String  client_status,
            @Field(" client_description") String  client_description
    );
    @FormUrlEncoded
    @POST("update_client_list.php")
    Call<Client_List> update_Client_List(
            @Field("client_id") int client_id ,
            @Field("client_name_id") String client_name_id ,
            @Field("client_manufacture_date") String  client_manufacture_date ,
            @Field("client_status") String  client_status,
            @Field(" client_description") String  client_description
    );
    @GET("read_client_list.php")
    Call<Client_List> read_by_id_Client_List(
            @Field("client_id") int client_id
    );

    @GET("client_list/readall_client_list.php")
    Call<List<Client_List>> readall_Client_List(

    );

    @POST("delete_client_list.php")
    Call<Client_List> delete_Client_List(
            @Field("client_id") int client_id
    );
}




