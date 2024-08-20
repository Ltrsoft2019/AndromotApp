package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Distributer_Cock;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
public interface Distributer_Cock_api {
    @FormUrlEncoded
    @POST("create_distributer_cock.php")
    Call<Distributer_Cock> create_Distributer_Cock(
            @Field("distributer_id") int distributer_id,
            @Field("cock_id") int cock_id
    );
    @FormUrlEncoded
    @POST("update_distributer_cock.php")
    Call<Distributer_Cock> update_Distributer_Cock(
            @Field("distributer_id") int distributer_id,
            @Field("distributer_cock_id") int distributer_cock_id,
            @Field("cock_id_")int cock_id

    );
    @GET("read_distributer_cock.php")
    Call<Distributer_Cock> read_by_id_Distributer_Cock(
            @Field("distributer_cock_id") int distributer_cock_id
    );
    @GET("readall_distributer_cock.php")
    Call<List<Distributer_Cock>> read_all_Distributer_Cock();


    @POST("delete_distributer_cock.php ")
    Call<Distributer_Cock> delete_by_id_Distributer_Cock(
            @Field("distributer_cock_id") int distributer_cock_id
    );
}


