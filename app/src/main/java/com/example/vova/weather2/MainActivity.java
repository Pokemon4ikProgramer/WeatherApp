package com.example.vova.weather2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.vova.weather2.Service.APIManager;
import com.example.vova.weather2.data.CityWeather;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="responce";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView b1;
        final TextView b2;
        final TextView b3;
        android.widget.SearchView s1;

        b1 = (TextView) findViewById(R.id.b1);
        b2 = (TextView) findViewById(R.id.b2);
        b3 = (TextView) findViewById(R.id.b3);
        s1 = (android.widget.SearchView) findViewById(R.id.s1);
        Call<CityWeather> cityWeatherCall = APIManager.getApiService().getWeatherInfo("Lviv", "56d6768324fcc2670085c4e0e9e80679");
        cityWeatherCall.enqueue(new Callback<CityWeather>() {
            @Override
            public void onResponse(Call<CityWeather> call, Response<CityWeather> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, response.body().toString());
                    b1.setText(response.body().toString());
                    b2.setText(response.body().displayWeatherInfo());
                    b3.setText(response.body().wind());
                } else {
                    Log.d(TAG, response.message());
                }
            }

            @Override
            public void onFailure(Call<CityWeather> call, Throwable t) {
                t.printStackTrace();
            }
        });
        s1.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);

            }
        });
    }
}
