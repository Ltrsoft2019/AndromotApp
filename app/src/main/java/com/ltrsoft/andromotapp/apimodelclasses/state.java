package com.ltrsoft.andromotapp.apimodelclasses;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface state {


    @FormUrlEncoded
    @POST("create_state.php")
    Call<state> createState(
            @Field("state_id") String state_id,
            @Field("state_name") String state_name,
            @Field("country_name") String country_name


    );

    @FormUrlEncoded
    @POST("update_state.php")
    Call<state> updateState(
            @Field("state_id") String state_id,
            @Field("state_name") String state_name,
            @Field("country_name") String country_name
    );

    @FormUrlEncoded
    @POST("delete_state.php")
    Call<state> deleteState(
            @Field("state_id") String state_id,
            @Field("state_name") String state_name,
            @Field("country_name") String country_name

    );

    @GET("readall_state.php")
    Call<List<state>> readAllstate();

    @GET("read_sensor_type.php")
    Call<state> read_by_id_state(
            @Field("state_id") String state_id
    );


}
