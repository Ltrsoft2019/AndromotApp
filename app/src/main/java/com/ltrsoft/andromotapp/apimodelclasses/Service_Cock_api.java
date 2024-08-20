package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Service_Cock;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service_Cock_api {

    @FormUrlEncoded
    @POST("create_service_user_cock.php")
    Call<Service_Cock> create_Service_Cock(
            @Field("service_provider_id") int service_provider_id,
            @Field("user_client_cock_id") int user_server_id,
            @Field("service_name") String service_name,
            @Field("service_description") String service_description,
            @Field("updated_warranty_date") String updated_warranty_date,
            @Field("service_date") String service_date
    );
    @FormUrlEncoded
    @POST("update_service_user_cock.php")
    Call<Service_Cock> update_Service_Cock(

            @Field("service_cock_id")int service_cock_id,
            @Field("service_provider_id") int service_provider_id,
            @Field("user_client_cock_id") int user_server_id,
            @Field("service_name") String service_name,
            @Field("service_description") String service_description,
            @Field("updated_warranty_date") int updated_warranty_date,
            @Field("service_date") int service_date

    );
    @GET("read_service_user_cock.php")
    Call<Service_Cock> read_by_id_Service_Cock(
            @Field("service_cock_id") int service_cock_id
    );
    @GET("readall_service_user_cock.php")
    Call<List<Service_Cock>> read_all_Service_Cock();

    @POST("delete_service_user_cock.php ")
    Call<Service_Cock> delete_by_id_Service_Cock(
            @Field("service_cock_id") int service_cock_id
    );
}



