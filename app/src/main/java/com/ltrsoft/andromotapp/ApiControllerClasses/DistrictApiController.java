package com.ltrsoft.andromotapp.ApiControllerClasses;


import com.ltrsoft.andromotapp.apimodelclasses.district;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DistrictApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/district/";
    private static DistrictApiController  Clientobject;
    private Retrofit retrofit;

    private DistrictApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized DistrictApiController getInstance() {
        if ( Clientobject == null) {
            Clientobject = new DistrictApiController();
        }
        return  Clientobject;
    }

    public district getdistrictService() {
        return retrofit.create(district.class);
    }



}
