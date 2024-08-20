package com.ltrsoft.andromotapp.apimodelclasses;
import com.ltrsoft.andromotapp.pojoclasses.Advertisement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface country {

    @FormUrlEncoded
    @POST("create_country.php")
    Call<country> createCountry(
            @Field("country_id") int country_id,
            @Field("country_name") String country_name


    );

    @FormUrlEncoded
    @POST("update_country.php")
    Call<country> updateCountry(
            @Field("country_id") String country_id,
            @Field("country_name") String country_name
    );

    @FormUrlEncoded
    @POST("delete_country.php")
    Call<country> deleteCountry(
            @Field("country_id") String country_id,
            @Field("country_name") String country_name

    );



    @GET("readall_country.php")
    Call<List<country>> readAllcountry();

    @GET("read_country.php")
    Call<country> read_by_id_country(
            @Field("country_id") String country_id
    );

}
