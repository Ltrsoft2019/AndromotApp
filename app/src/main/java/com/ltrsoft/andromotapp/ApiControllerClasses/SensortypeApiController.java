package com.ltrsoft.andromotapp.ApiControllerClasses;


import com.ltrsoft.andromotapp.apimodelclasses.sensor_type;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SensortypeApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/andromot/sensor_type/";
    private static SensortypeApiController  Clientobject;
    private Retrofit retrofit;

    private SensortypeApiController () {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized SensortypeApiController getInstance() {
        if ( Clientobject == null) {
            Clientobject = new SensortypeApiController ();
        }
        return  Clientobject;
    }

    public sensor_type getsensor_typeService() {
        return retrofit.create(sensor_type.class);
    }





}
