package com.ltrsoft.andromotapp.apimodelclasses;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface feedback {


    @FormUrlEncoded
    @POST("create_feedback.php")
    Call<feedback> createFeedback(
            @Field("feedback_id") int feedback_id,
            @Field("user_name") String user_name,
            @Field("rating") int rating ,
            @Field("description")String description


    );

    @FormUrlEncoded
    @POST("update_feedback.php")
    Call<feedback> updateFeedback(
            @Field("feedback_id") int feedback_id,
            @Field("user_name") String user_name,
            @Field("rating") int rating ,
            @Field("description")String description


    );

    @FormUrlEncoded
    @POST("delete_feedback.php")
    Call<feedback> deleteFeedback(
            @Field("feedback_id") String feedback_id,
            @Field("user_name") String user_name,
            @Field("rating") String rating ,
            @Field("description")String description


    );

    @FormUrlEncoded
    @POST("feedback_4")
    Call<feedback> readAllFeedback(
            @Field("feedback_id") String feedback_id,
            @Field("user_name") String user_name,
            @Field("rating") String rating ,
            @Field("description")String description


    );


    @GET("readall_feedback.php")
    Call<List<feedback>> readAllfeedback();

    @GET("read_feedback.php")
    Call<feedback> read_by_id_feedback(
            @Field("feedback_id") String feedback_id
    );




}
