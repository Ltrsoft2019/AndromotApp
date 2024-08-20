package com.ltrsoft.andromotapp.ApiControllerClasses;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AdvertisementApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/andromot/advertisement/";
    private static AdvertisementApiController clientobject; 
    private static Retrofit retrofit;

    private AdvertisementApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized AdvertisementApiController getInstance() {
        if (clientobject == null) {
            clientobject = new AdvertisementApiController();
        }
        return clientobject;
    }

    public AdvertisementApiController getAdvertisementApi() {
        return retrofit.create(AdvertisementApiController.class);
    }
}
