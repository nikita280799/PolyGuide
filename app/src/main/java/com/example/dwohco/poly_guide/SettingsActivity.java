package com.example.dwohco.poly_guide;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class SettingsActivity extends AppCompatActivity {

    private SharedPreferences preferences;
    private Locale locale;
    private String lang;

    //@Override
    public void onCreate() {
        //super.onCreate();
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        lang = preferences.getString("lang", "en");
        if (lang.equals("en")) {
            lang = getResources().getConfiguration().locale.getCountry();
        }
        locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, null);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, null);
    }
}
