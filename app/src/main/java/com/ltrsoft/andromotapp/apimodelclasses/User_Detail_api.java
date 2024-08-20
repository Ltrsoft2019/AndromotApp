package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Admin;
import com.ltrsoft.andromotapp.pojoclasses.User_Detail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface User_Detail_api {
    @FormUrlEncoded
    @POST("create_user_detail.php")
    Call<User_Detail> create_User_Detail(
            @Field("user_fname") String user_fname,
            @Field(" user_mname") String  user_mname,
            @Field("user_lname") String user_lname,
            @Field("email_id") String email_id,
            @Field("user_phone") int user_phone,
            @Field("state") String state,
            @Field("city") String  city,
            @Field(" country") String   country,
            @Field("district") String  district,
            @Field("user_image") int user_image

    );
    @FormUrlEncoded
    @POST("update_user_detail.php")
    Call<User_Detail> update_User_Detail(
            @Field("user_id") int user_id,
            @Field("user_fname") String user_fname,
            @Field(" user_mname") String  user_mname,
            @Field("user_lname") String user_lname,
            @Field("email_id") String email_id,
            @Field("user_phone") int user_phone,
            @Field("state") String state,
            @Field("city") String  city,
            @Field(" country") String   country,
            @Field("district") String  district,
            @Field("user_address") String user_address,
            @Field("user_image") int user_image

    );
    @POST("delete_user_detail.php")
    Call<User_Detail> delete_User_Detail(
            @Field("user_id") int user_id
    );
    @GET("read_user_id.php")
    Call<User_Detail> read_by_id_User_Detail(
            @Field("user_id") int user_id
    );
    @GET("read_user_detail.php")
    Call <List<User_Detail>> readall_User_Detail();
}














