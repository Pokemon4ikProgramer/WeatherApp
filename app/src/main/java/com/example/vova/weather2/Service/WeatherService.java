package com.example.vova.weather2.Service;

import com.example.vova.weather2.data.CityWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vova on 10.03.17.
 */

public interface WeatherService {

    @GET("data/2.5/weather")
    Call<CityWeather> getWeatherInfo(@Query("q") String cityName,
                                     @Query("appid") String appid);
    }

