package com.ltrsoft.andromotapp.utils;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static String baseUrl ="https://andromot.ltr-soft.com/public/andromot/";

    private static Retrofit instance=null;
    public static Retrofit getInstance(String baseUrl){
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    //.addConverterFactory(FormUrlEncodedConverter.create())
                    .build();

        }
        return instance;
    }
}
