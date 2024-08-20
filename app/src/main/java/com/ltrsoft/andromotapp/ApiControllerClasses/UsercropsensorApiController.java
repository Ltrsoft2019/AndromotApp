package com.ltrsoft.andromotapp.ApiControllerClasses;

import com.ltrsoft.andromotapp.apimodelclasses.UserCropSensor;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsercropsensorApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/user_crop_sensor/";
    private static UsercropsensorApiController  Clientobject;
    private Retrofit retrofit;

    private  UsercropsensorApiController () {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized UsercropsensorApiController  getInstance() {
        if ( Clientobject == null) {
            Clientobject = new  UsercropsensorApiController ();
        }
        return Clientobject;
    }

    public UserCropSensor getUserCropSensorService() {
        return retrofit.create(UserCropSensor.class);
    }





}
