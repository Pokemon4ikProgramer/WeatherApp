package com.example.vova.weather2.data;

/**
 * Created by vova on 10.03.17.
 */

public class MainWeather {
    private double temp;
    private double pressure;
    private int humidity;
    private double tempMin;
    private double tempMax;


    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    @Override
    public String toString() {
        return (temp=temp-273.15)+ "°C"+ "   "+ (Math.round((pressure=pressure/1.33322)*10)/10)+ "  mmHg";

    }
}
