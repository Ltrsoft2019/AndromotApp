package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Enquiry_Problem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Enquiry_Problem_api {

    @FormUrlEncoded
    @POST("create_enquiry_problem.php")
    Call<Enquiry_Problem> create_Enquiry_Problem(
            @Field("enquiry_problem_title") String enquiry_problem_title,
            @Field("enquiry_problem_description") String enquiry_problem_description,
            @Field("user_id") int user_id

    );
    @FormUrlEncoded
    @POST("update_enquiry_problem.php")
    Call<Enquiry_Problem> update_Enquiry_Problem(

            @Field("enquiry_problem_id")int enquiry_problem_id,
            @Field("enquiry_problem_title") String enquiry_problem_title,
            @Field("enquiry_problem_description")String enquiry_problem_description,
            @Field("user_id")int user_id

    );
    @GET("read_enquiry_problem.php")
    Call<Enquiry_Problem> read_by_id_Enquiry_Problem(
            @Field("enquiry_problem_id") int enquiry_problem_id
    );
    @GET("readall_enquiry_problem.php")
    Call<List<Enquiry_Problem>> read_all_Enquiry_Problem();

    @POST("delete_enquiry_problem.php ")
    Call<Enquiry_Problem> delete_by_id_Enquiry_Problem(
            @Field("enquiry_problem_id") int enquiry_problem_id
    );
}
