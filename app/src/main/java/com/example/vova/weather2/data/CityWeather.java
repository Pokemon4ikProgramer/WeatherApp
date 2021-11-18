package com.example.vova.weather2.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vova on 10.03.17.
 */

public class CityWeather {
    private int id;
    private String name;
    private int cod;
    @SerializedName("coord")
    private Coordinates coordinates;
    private List<Weather> weather;
    private Wind wind;

    @SerializedName("main")
    private MainWeather mainWeather;

    //"Lviv", "56d6768324fcc2670085c4e0e9e80679"

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public MainWeather getMainWeather() {
        return mainWeather;
    }

    public void setMainWeather(MainWeather mainWeather) {
        this.mainWeather = mainWeather;
    }

  /*  @Override
    public String toString() {
        return "CityWeather{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                ", coordinates=" + coordinates +
                ", weather=" + weather +
                ", wind=" + wind +
                ", mainWeather=" + mainWeather +
                '}';
    }

*/

    @Override
    public String toString() {
        return name;
    }

    public String displayWeatherInfo () {
        return String.valueOf(mainWeather);
    }

    public String wind(){
        return String.valueOf(wind);
    }
}
