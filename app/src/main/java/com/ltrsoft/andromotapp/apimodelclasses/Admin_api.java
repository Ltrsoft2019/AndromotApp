package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Admin;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Admin_api {
    @FormUrlEncoded
    @POST("create_admin.php")
    Call<Admin> create_Admin(
            @Field("admin_id") String admin_id,
            @Field("admin_fname") String admin_fname,
            @Field("admin_mname") String admin_mname,
            @Field("admin_lname") String admin_lname,
            @Field("coutry_id") String coutry_id,
            @Field("state_id") String state_id,
            @Field("district_id") String  district_id,
            @Field("city_id") String  city_id,
            @Field("email_id") String  email_id,
            @Field("password") String  password,
            @Field("address") String address,
            @Field("mobile1") String mobile1,
            @Field(" mobile2") String  mobile2
    );
    @FormUrlEncoded
    @POST("update_admin.php")
    Call<Admin> update_Admin(
            @Field("admin_id")String admin_id,
            @Field("admin_fname") String admin_fname,
            @Field("admin_mname") String admin_mname,
            @Field("admin_lname") String admin_lname,
            @Field("coutry_id") String coutry_id,
            @Field("state_id") String state_id,
            @Field("district_id") String  district_id,
            @Field("city_id") String  city_id,
            @Field("email_id") String  email_id,
            @Field("password") String  password,
            @Field("address") String    address,
            @Field("mobile1") String   mobile1,
            @Field(" mobile2") String    mobile2
    );
    @GET("read_admin_by_id.php")
    Call<Admin> read_by_id_Admin(
            @Field("admin_id") String admin_id
    );
    @GET("readall_admin.php")
    Call<List<Admin>> read_all_Admin();

    @POST(" ")        //messing delete php file
    Call<Admin> delete_by_id_Admin(
            @Field("admin_id") String admin_id
    );
}












