package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Client_List;
import com.ltrsoft.andromotapp.pojoclasses.Cock_List;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Cock_List_api {
    @FormUrlEncoded
    @POST("cock_list/create_cock_list.php")
    Call<Cock_List> create_Cock_List(
            @Field("cock_name_id") String cock_name_id ,
            @Field("cock_manufacture_date") int cock_manufacture_date ,
            @Field("cock_status") String  cock_status,
            @Field("cock_description") String  cock_description
    );
    @FormUrlEncoded
    @POST("cock_list/update_cock_list.php")
    Call<Cock_List> update_Cock_List(
            @Field("cock_id") int cock_id,
            @Field("cock_name_id") String cock_name_id ,
            @Field("cock_manufacture_date") int cock_manufacture_date ,
            @Field("cock_status") String  cock_status,
            @Field("cock_description") String  cock_description
    );
    @GET("cock_list/read_cock_list.php")
    Call<Cock_List> read_by_id_Cock_List(
            @Field("cock_id") int cock_id
    );

    @GET("cock_list/readall_cock_list.php")
    Call<List<Cock_List>> readall_Cock_List();

    @POST("cock_list/delete_cock_list.php")
    Call<Cock_List> delete_Cock_List(
            @Field("cock_id") int cock_id
    );
}



