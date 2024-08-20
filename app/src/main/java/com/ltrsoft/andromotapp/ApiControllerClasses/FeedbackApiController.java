package com.ltrsoft.andromotapp.ApiControllerClasses;


import com.ltrsoft.andromotapp.apimodelclasses.feedback;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FeedbackApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/andromot/feedback/";
    private static  FeedbackApiController Clientobject;
    private Retrofit retrofit;

    private  FeedbackApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized FeedbackApiController getInstance() {
        if ( Clientobject == null) {
            Clientobject = new  FeedbackApiController();
        }
        return  Clientobject;
    }

    public feedback getfeedbackService() {
        return retrofit.create(feedback.class);
    }



}
