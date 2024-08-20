package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Distributers;
import com.ltrsoft.andromotapp.pojoclasses.Service_Providers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service_Providers_api {
    @FormUrlEncoded
    @POST("create_service_provider.php")
    Call<Service_Providers> create_Service_Providers(
            @Field("service_provider_id") int service_provider_id,
            @Field("servicep_full_name") String servicep_full_name,
            @Field("servicep_shop_name") String servicep_shop_name,
            @Field("country_id") String country_id ,
            @Field("state_id") String state_id ,
            @Field("district_id") String district_id,
            @Field("city_id") String city_id,
            @Field("email_id") String email_id,
            @Field("password") String password,
            @Field("service_provider_address") String  service_provider_address,
            @Field("pan_no") String pan_no,
            @Field("gst_no") int gst_no,
            @Field("is_distributer") String  is_distributer

    );
    @FormUrlEncoded
    @POST("update_service_provider.php")
    Call<Service_Providers> update_Service_Providers(
            @Field("service_provider_id") int service_provider_id,
            @Field("servicep_full_name") String servicep_full_name,
            @Field("servicep_shop_name") String servicep_shop_name,
            @Field("country_id") String country_id ,
            @Field("state_id") String state_id ,
            @Field("district_id") String district_id,
            @Field("city_id") String city_id,
            @Field("email_id") String email_id,
            @Field("password") String password,
            @Field("service_provider_address") String  service_provider_address,
            @Field("pan_no") String pan_no,
            @Field("gst_no") int gst_no,
            @Field("is_distributer") String  is_distributer

    );
    @GET("read_service_provider.php")
    Call<Service_Providers> read_by_id_Service_Providers(
            @Field("service_provider_id") int service_provider_id);

    @GET("readall_service_provider.php")
    Call<List<Service_Providers>> readall_Service_Providers();

    @POST("delete_service_provider.php")
    Call<Service_Providers> delete_Service_Providers(
            @Field("service_provider_id") int service_provider_id
    );
}











