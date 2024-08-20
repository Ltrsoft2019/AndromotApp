package com.ltrsoft.andromotapp.apimodelclasses;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface district {

    @FormUrlEncoded
    @POST("create_district.php")
    Call<district> createDistrict(
            @Field("district_id") String district_id,
            @Field("district_name") String district_name,
            @Field("country_name")String country_name


    );

    @FormUrlEncoded
    @POST("update_district.php")
    Call<district> updateDistrict(
            @Field("district_id") String district_id,
            @Field("district_name") String district_name,
            @Field("country_name")String country_name

    );

    @FormUrlEncoded
    @POST("delete_district.php")
    Call<district> deleteDistrict(
            @Field("district_id") String district_id,
            @Field("district_name") String district_name,
            @Field("country_name") String country_name


    );




    @GET("readall_district.php")
    Call<List<district>> readAlldistrict();

    @GET("read_district.php")
    Call<district> read_by_id_district(
            @Field("district_id")String district_id
    );


}
