package com.ltrsoft.andromotapp.apimodelclasses;

import com.ltrsoft.andromotapp.pojoclasses.Sensor_Order;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface sensor_order {


    @FormUrlEncoded
    @POST("create_sensor_order.php")
    Call<Sensor_Order> createSensor_order(
            @Field("order_id") String order_id,
            @Field("sensor_type_id") String sensor_type_id,
            @Field("user_id") String userId,
          @Field("quantity")   String quantity,
            @Field("total_price") String total_price,
            @Field("payment_mode") String payment_mode,
            @Field("order_status") String order_status

    );

    @FormUrlEncoded
    @POST("update_sensor_order.php")
    Call<Sensor_Order> updateSensor_order(
            @Field("order_id") String order_id,
            @Field("sensor_type_id") String sensor_type_id,
            @Field("user_id") String userId,
            @Field("quantity")   String quantity,
            @Field("total_price") String total_price,
            @Field("payment_mode") String payment_mode,
            @Field("order_status") String order_status
    );

    @FormUrlEncoded
    @POST("delete_sensor_order.php")
    Call<Sensor_Order> deleteSensor_order(
            @Field("order_id") String order_id,
            @Field("sensor_type_id") String sensor_type_id,
            @Field("user_id") String userId,
            @Field("quantity")   String quantity,
            @Field("total_price") String total_price,
            @Field("payment_mode") String payment_mode,
            @Field("order_status") String order_status

    );

    @GET("readall_sensor_order.php")
    Call<List<sensor_order>> readAllsensor_order();

    @GET("read_sensor_order.php")
    Call<sensor_order> read_by_id_sensor_order(
            @Field("order_id") String order_id
    );

}
