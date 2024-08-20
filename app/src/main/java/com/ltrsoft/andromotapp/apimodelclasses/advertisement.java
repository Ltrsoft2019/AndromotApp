package com.ltrsoft.andromotapp.apimodelclasses;
import com.ltrsoft.andromotapp.pojoclasses.Advertisement;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface advertisement {

    @FormUrlEncoded
    @POST("create_advertisement.php")
    Call<Advertisement> createAdvertisement(
            @Field("advertisement_id") String advertisement_id,
            @Field("title") String title,
            @Field("description") String description,
            @Field("images") String images
    );

    @FormUrlEncoded
    @POST("update_advertisement.php")
    Call<Advertisement> updateAdvertisement(
            @Field("advertisement_id") String advertisement_id,
            @Field("title") String title,
            @Field("description") String description,
            @Field("images") String images
    );

    @FormUrlEncoded
    @POST("delete_advertisement.php")
    Call<Advertisement> deleteAdvertisement(
            @Field("advertisement_id") String advertisement_id
            );


    @GET("readall_advertisement.php")
    Call<List<Advertisement>> readAllAdvertisement();

    @GET("read_advertisement.php")
    Call<Advertisement> read_by_id_Advertisement(
            @Field("advertisement_id") String advertisement_id
    );

}
