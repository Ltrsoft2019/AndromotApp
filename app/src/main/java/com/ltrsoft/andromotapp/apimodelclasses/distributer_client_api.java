package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Cock_List;
import com.ltrsoft.andromotapp.pojoclasses.Distributer_Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Distributer_Client_api {
    @FormUrlEncoded
    @POST("create_distributer_client.php")
    Call<Distributer_Client> create_Distributer_Client(
            @Field("distributer_id") String distributer_id ,
            @Field("client_id") String  client_id
    );
    @FormUrlEncoded
    @POST("update_distributer_client.php")
    Call<Distributer_Client> update_Distributer_Client(
            @Field("distributer_id") String distributer_id ,
            @Field("client_id") String  client_id
    );
    @GET("read_distributer_client.php")
    Call<Distributer_Client> read_by_id_Distributer_Client(
            @Field("distributer_id") String distributer_id
    );

    @GET("readall_distributer_client.php")
    Call<List<Distributer_Client>> readall_Distributer_Client();

    @POST("delete_distributer_client.php")
    Call<Distributer_Client> delete_Distributer_Client(
            @Field("distributer_id") String distributer_id
    );
}

