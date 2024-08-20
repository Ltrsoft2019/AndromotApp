package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Manager;
import com.ltrsoft.andromotapp.pojoclasses.Service_Providers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Manager_api {
    @FormUrlEncoded
    @POST("create_service_provider.php")
    Call<Manager> create_Manager(
            @Field("manager_id") int Manager_id,
            @Field(" manager_fullname") String  manager_fullname,
            @Field("coutry_id") String coutry_id,
            @Field("state_id") String state_id ,
            @Field("district_id") String district_id,
            @Field("city_id") String city_id,
            @Field("email_id") String email_id,
            @Field("password") String password,
            @Field("address") String address,
            @Field("mobile1") int mobile1,
            @Field("mobile2") int mobile2
    );
    @FormUrlEncoded
    @POST("update_manager.php")
    Call<Manager> update_Manager(
            @Field("manager_id") int Manager_id,
            @Field(" manager_fullname") String  manager_fullname,
            @Field("coutry_id") String coutry_id,
            @Field("state_id") String state_id ,
            @Field("district_id") String district_id,
            @Field("city_id") String city_id,
            @Field("email_id") String email_id,
            @Field("password") String password,
            @Field("address") String address,
            @Field("mobile1") int mobile1,
            @Field("mobile2") int mobile2
    );
    @GET("read_manager.php")
    Call<Manager> read_by_id_Manager(
            @Field("manager_id") int Manager_id
    );

    @GET("readall_manager.php")
    Call<List<Manager>> readall_Manager();

    @POST("delete_manager.php")
    Call<Manager> delete_Manager(
            @Field("manager_id") int Manager_id
    );
}










