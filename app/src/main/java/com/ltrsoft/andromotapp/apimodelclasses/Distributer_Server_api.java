package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Distributer_Server;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Distributer_Server_api {

    @FormUrlEncoded
    @POST("create_distributer_server.php")
    Call<Distributer_Server> create_Distributer_Server(
            @Field("distributer_id") int distributer_id,
            @Field("server_id") int server_id
    );
    @FormUrlEncoded
    @POST("update_distributer_server.php")
    Call<Distributer_Server> update_Distributer_Server(
            @Field("distributer_server_id") int distributer_server_id,
            @Field("distributer_id") int distributer_id,
            @Field("server_id_")int server_id
    );
    @GET("read_distributer_server.php")
    Call<Distributer_Server> read_by_id_Distributer_Server(
            @Field("distributer_server_id") int distributer_server_id
    );
    @GET("readall_distributer_server.php")
    Call<List<Distributer_Server>> read_all_Distributer_Server();

    @POST("delete_distributer_server.php ")
    Call<Distributer_Server> delete_by_id_Distributer_Server(
            @Field("distributer_server_id") int distributer_server_id
    );
}




