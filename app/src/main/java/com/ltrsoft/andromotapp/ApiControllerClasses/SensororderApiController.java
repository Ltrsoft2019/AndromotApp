package com.ltrsoft.andromotapp.ApiControllerClasses;


import com.ltrsoft.andromotapp.apimodelclasses.sensor_order;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SensororderApiController {



    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/andromot/sensor_order/";
    private static SensororderApiController  Clientobject;
    private Retrofit retrofit;

    private SensororderApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized SensororderApiController getInstance() {
        if ( Clientobject == null) {
            Clientobject = new  SensororderApiController();
        }
        return  Clientobject;
    }

    public sensor_order getsensor_orderService() {
        return retrofit.create(sensor_order.class);
    }


}
