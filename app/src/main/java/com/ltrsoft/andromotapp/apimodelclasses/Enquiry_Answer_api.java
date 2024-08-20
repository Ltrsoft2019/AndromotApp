package com.ltrsoft.andromotapp.apimodelclasses;
import com.ltrsoft.andromotapp.pojoclasses.Enquiry_Answer;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
public interface Enquiry_Answer_api {

    @FormUrlEncoded
    @POST("create_enquiry_answer.php")
    Call<Enquiry_Answer> create_Enquiry_Answer(
            @Field("enquiry_problem_id") int enquiry_problem_id,
            @Field("manager_id") int manager_id,
            @Field("answer_description") String answer_discription

    );
    @FormUrlEncoded
    @POST("update_enquiry_answer.php")
    Call<Enquiry_Answer> update_Enquiry_Answer(

            @Field("enquiry_answer_id")int enquiry_answer_id,
            @Field("enquiry_problem_id") int answer_problem_id,
            @Field("answer_description")String answer_description,
            @Field("manager_id")int manager_id

    );
    @GET("read_enquiry_answer_by_id.php")
    Call<Enquiry_Answer> read_by_id_Enquiry_Answer(
            @Field("enquiry_answer_id") int enquiry_answer_id
    );

    @GET("readall_enquiry_answer.php")
    Call<List<Enquiry_Answer>> read_all_Enquiry_Answer();

    @POST("delete_enquiry_answer.php ")
    Call<Enquiry_Answer> delete_by_id_Enquiry_Answer(
            @Field("enquiry_answer_id") int enquiry_answer_id
    );
}


