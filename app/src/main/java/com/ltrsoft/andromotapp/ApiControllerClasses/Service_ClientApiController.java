package com.ltrsoft.andromotapp.ApiControllerClasses;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service_ClientApiController {

    private static String url="https://andromot.ltr-soft.com/public/andromot/distributer_cock/";
    private static Distributer_ClientApiController clientobject;
    private static Retrofit retrofit;
    Service_ClientApiController()
    {

        retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized Distributer_ClientApiController getInstance()
    {
        if(clientobject==null)
            clientobject= new Distributer_ClientApiController();
        return clientobject;
    }
    Service_ClientApiController getapi()
    {

        return retrofit.create( Service_ClientApiController.class);
    }
}

