package com.ltrsoft.andromotapp.ApiControllerClasses;
import com.ltrsoft.andromotapp.apimodelclasses.city;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CityApiController {

    private static final String BASE_URL = "https://andromot.ltr-soft.com/public/city/";
    private static CityApiController Clientobject;
    private Retrofit retrofit;

    private CityApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized CityApiController getInstance() {
        if (Clientobject == null) {
            Clientobject = new CityApiController();
        }
        return Clientobject;
    }

    public city getCityService() {
        return retrofit.create(city.class);
    }
}
