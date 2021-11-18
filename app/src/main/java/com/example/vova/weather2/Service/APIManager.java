package com.example.vova.weather2.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vova on 10.03.17.
 */

public class APIManager {

    private static WeatherService weatherService;
    private static final String URL = "http://api.openweathermap.org/";


    public static WeatherService getApiService () {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherService = retrofit.create(WeatherService.class);

        return weatherService;

    }

}
