package com.ltrsoft.andromotapp.ApiControllerClasses;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Distributer_ServerApiController {


    private static String url="https://andromot.ltr-soft.com/public/andromot/distributer/";
    private static Distributer_ClientApiController clientobject;
    private static Retrofit retrofit;
    Distributer_ServerApiController()
    {
        retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized Distributer_ClientApiController getInstance()
    {
        if(clientobject==null)
            clientobject=new Distributer_ClientApiController();
        return clientobject;
    }
    Distributer_ServerApiController getapi()
    {

        return retrofit.create(Distributer_ServerApiController.class);
    }
}

