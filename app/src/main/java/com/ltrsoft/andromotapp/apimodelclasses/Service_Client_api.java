package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Service_Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service_Client_api {

    @FormUrlEncoded
    @POST("create_service_user_client.php")
    Call<Service_Client> create_Service_Client(
            @Field("service_provider_id") int service_provider_id,
            @Field("user_client_cock_id") int user_server_id,
            @Field("service_name") String service_name,
            @Field("service_description") String service_description,
            @Field("updated_warranty_date") String updated_warranty_date,
            @Field("service_date") int service_date
    );
    @FormUrlEncoded
    @POST("update_service_user_client.php")
    Call<Service_Client> update_Service_Client(
            @Field("service_client_id")int service_client_id,
            @Field("service_name") String service_name,
            @Field("service_description") String service_description,
            @Field("updated_warranty_date") String updated_warranty_date,
            @Field("service_date") String service_date

    );
    @GET("read_service_user_client.php")
    Call<Service_Client> read_by_id_Service_Client(
            @Field("service_client_id") int service_client_id
    );
    @GET("readall_service_user_client.php")
    Call<List<Service_Client>> read_all_Service_Client();

    @POST("delete_service_user_client.php ")
    Call<Service_Client> delete_by_id_Service_Client(
            @Field("service_client_id") int service_client_id
    );
}



