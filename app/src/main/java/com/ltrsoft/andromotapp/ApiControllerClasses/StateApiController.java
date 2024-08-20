package com.ltrsoft.andromotapp.ApiControllerClasses;


import com.ltrsoft.andromotapp.apimodelclasses.state;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StateApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/state/";
    private static StateApiController  Clientobject;
    private Retrofit retrofit;

    private  StateApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized StateApiController getInstance() {
        if ( Clientobject == null) {
            Clientobject = new StateApiController();
        }
        return  Clientobject;
    }

    public state getstateService() {
        return retrofit.create(state.class);
    }





}
