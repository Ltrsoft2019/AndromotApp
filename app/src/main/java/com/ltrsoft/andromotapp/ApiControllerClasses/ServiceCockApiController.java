package com.ltrsoft.andromotapp.ApiControllerClasses;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ServiceCockApiController {

    private static String url="https://andromot.ltr-soft.com/public/andromot/distributer_cock/";
    private static Distributer_ClientApiController clientobject;
    private static Retrofit retrofit;
    ServiceCockApiController()
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
    ServiceCockApiController getapi()
    {
        return retrofit.create( ServiceCockApiController.class);
    }


}
