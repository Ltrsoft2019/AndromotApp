package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Service_Server;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
public interface Service_Server_api {
    @FormUrlEncoded
    @POST("create_service_user_server.php")
    Call<Service_Server> create_Service_Server(
            @Field("service_provider_id") int service_provider_id,
            @Field("user_server_id") int user_server_id,
            @Field("service_name") String service_name,
            @Field("service_description") String service_description,
            @Field("updated_warranty_date") int updated_warranty_date
    );
    @FormUrlEncoded
    @POST("update_service_user_server.php")
    Call<Service_Server> update_Service_Server(
            @Field("service_server_id_")int server_id,
            @Field("user_server_id") int user_server_id,
    @Field("service_name") String service_name,
    @Field("service_description") String service_description,
    @Field("updated_warranty_date") int updated_warranty_date
    );
    @GET("read_service_user_server.php")
    Call<Service_Server> read_by_id_Service_Server(
            @Field("service_server_id") int service_server_id
    );
    @GET("readall_service_user_server.php")
    Call<List<Service_Server>> read_all_Service_Server();

    @POST("delete_service_user_server.php ")
    Call<Service_Server> delete_by_id_Service_Server(
            @Field("service_server_id") int service_server_id
    );
}

