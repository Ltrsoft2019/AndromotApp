package com.ltrsoft.andromotapp.utils;

import com.ltrsoft.andromotapp.apimodelclasses.Crop_Details_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/andromot/";
    private static Retrofit retrofit;

public static Retrofit getRetrofitInstance(){

    if(retrofit == null){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    return retrofit;
}
}
