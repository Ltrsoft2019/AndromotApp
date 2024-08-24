    package com.ltrsoft.andromotapp.apimodelclasses;

    import com.ltrsoft.andromotapp.pojoclasses.Client_List;
    import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;

    import java.util.List;

    import retrofit2.Call;
    import retrofit2.http.Field;
    import retrofit2.http.FormUrlEncoded;
    import retrofit2.http.GET;
    import retrofit2.http.POST;
    import retrofit2.http.Query;

    public interface Crop_Details_api {

        @FormUrlEncoded
        @POST("crop_detail/create_crop_detail.php")
        Call<Crop_Details> create_Crop_Details(
                @Field("crop_name") String crop_name,
                @Field("description") String description,
                @Field("required_threshold_value") String required_threshold_value,
                @Field("crop_image") String crop_image
        );

        @FormUrlEncoded
        @POST("crop_detail/update_crop_detail.php")
        Call<Crop_Details> update_Crop_Details(
                @Field("crop_name") String crop_name,
                @Field("description") String description,
                @Field("required_threshold_value") String required_threshold_value,
                @Field("crop_image") String crop_image,
                @Field("crop_id") int crop_id
        );

        @FormUrlEncoded
        @POST("crop_detail/delete_crop_detail.php")
        Call<Crop_Details> delete_Crop_Details(
                @Field("crop_id") int crop_id
        );

       /* @GET("id_crop_detail.php")
        Call<Crop_Details> read_by_id_Crop_Details(
                @Query("crop_id") int crop_id
        );*/

        /*@POST("crop_detail/id_crop_detail.php")
        Call<Crop_Details> read_by_id_Crop_Details(
                @Query("crop_id") String crop_id
        );
*/
        @GET("crop_detail/id_crop_detail.php")
        Call<List<Crop_Details>> read_by_id_Crop_Details(@Query("crop_id") int crop_id);


        @GET("crop_detail/read_crop_detail.php")
        Call<List<Crop_Details>> read_Crop_Details();

        @GET("crop_detail/recent_crop.php")
        Call<List<Crop_Details>> recent_Crop_Details();
    }
