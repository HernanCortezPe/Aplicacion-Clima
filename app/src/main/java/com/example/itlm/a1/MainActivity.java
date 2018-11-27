package com.example.itlm.a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.zetterstrom.com.forecast.ForecastClient;
import android.zetterstrom.com.forecast.ForecastConfiguration;
import android.zetterstrom.com.forecast.models.Language;
import android.zetterstrom.com.forecast.models.Unit;

public class MainActivity extends AppCompatActivity {
public final String DarkSkyApiKey="ccab79db2e2c5f3f8f3bfc816c7cb2d8";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ForecastConfiguration configuration =
                new ForecastConfiguration.Builder(DarkSkyApiKey)
                .setDefaultLanguage(Language.SPANISH)
                .setDefaultUnit(Unit.SI)
                .setCacheDirectory(getCacheDir())
                .build();
        ForecastClient.create(configuration);
    }
}
