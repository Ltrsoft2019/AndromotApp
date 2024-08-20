package com.ltrsoft.andromotapp.apimodelclasses;
import com.ltrsoft.andromotapp.pojoclasses.Advertisement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface city {

    @FormUrlEncoded
    @POST("create_city.php")
    Call<city> createCity(
            @Field("city_id") String city_id,
            @Field("city_name") String city_name,
            @Field("district_name")String district_name


    );

    @FormUrlEncoded
    @POST("updatete_city.php")
    Call<city> updateCity(
            @Field("city_id") String city_id,
            @Field("city_name") String city_name,
            @Field("district_name")String district_name

    );

    @FormUrlEncoded
    @POST("delete_city.php")
    Call<city> deleteCity(
            @Field("city_id")String city_id,
            @Field("city_name") String city_name,
            @Field("district_name")String district_name


    );


    @GET("readall_city.php")
    Call<List<city>> readAllcity();

    @GET("read_city.php")
    Call<city> read_by_id_city(
            @Field("city_id") String  city_id
    );


}
