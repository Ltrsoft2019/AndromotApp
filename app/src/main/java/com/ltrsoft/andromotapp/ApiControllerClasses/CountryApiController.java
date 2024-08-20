package com.ltrsoft.andromotapp.ApiControllerClasses;


import com.ltrsoft.andromotapp.apimodelclasses.country;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CountryApiController {


    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/country//";
    private static CountryApiController  Clientobject;
    private Retrofit retrofit;

    private CountryApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized CountryApiController getInstance() {
        if ( Clientobject == null) {
            Clientobject = new CountryApiController();
        }
        return  Clientobject;
    }

    public country getcountryService() {
        return retrofit.create(country.class);
    }



}
