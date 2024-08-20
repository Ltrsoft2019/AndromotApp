package com.ltrsoft.andromotapp.ApiControllerClasses;

import com.ltrsoft.andromotapp.apimodelclasses.Admin_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Admin_apicontroller {
    private static String url="https://andromot.ltr-soft.com/public/andromot/admin/";
    private static Admin_apicontroller clientobject;
    private static Retrofit retrofit;

    public Admin_apicontroller() {
        retrofit= new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized Admin_apicontroller getInstance()
    {
        if(clientobject==null)
            clientobject=new Admin_apicontroller();
        return clientobject;
    }
    Admin_api getAdmin_api()
    {
        return retrofit.create(Admin_api.class);
    }
}
