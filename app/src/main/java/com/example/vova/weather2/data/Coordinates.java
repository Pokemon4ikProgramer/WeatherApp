package com.example.vova.weather2.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vova on 10.03.17.
 */

public class Coordinates {
    private double longitude;
    private double latitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
