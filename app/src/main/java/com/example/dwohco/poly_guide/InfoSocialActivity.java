package com.example.dwohco.poly_guide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class InfoSocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_social);

        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.back:
                                Intent intentBack = new Intent(InfoSocialActivity.this, InfoActivity.class);
                                startActivity(intentBack);
                                return true;
                            case R.id.home:
                                Intent intent = new Intent(InfoSocialActivity.this, MainActivity.class);
                                startActivity(intent);
                                return true;
                            case R.id.search:

                        }
                        return false;
                    }
                });
    }
    public int key;
    public void settlement (View view) {
        Intent intentSettlement = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 0;
        intentSettlement.putExtra("key", key);
        startActivity (intentSettlement);
    }

    public void hostel (View view) {
        Intent intentHostel = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 1;
        intentHostel.putExtra("key", key);
        startActivity (intentHostel);
    }

    public void relax (View view) {
        Intent intentRelax = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 2;
        intentRelax.putExtra("key", key);
        startActivity (intentRelax);
    }

    public void medical (View view) {
        Intent intentMedical = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 3;
        intentMedical.putExtra("key", key);
        startActivity (intentMedical);
    }

    public void grant (View view) {
        Intent intentGrant = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 4;
        intentGrant.putExtra("key", key);
        startActivity (intentGrant);
    }

    public void army (View view) {
        Intent intentArmy = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 5;
        intentArmy.putExtra("key", key);
        startActivity (intentArmy);
    }

    public void trip (View view) {
        Intent intentTrip = new Intent(InfoSocialActivity.this, ConcreteInfoSocialActivity.class);
        key = 6;
        intentTrip.putExtra("key", key);
        startActivity (intentTrip);
    }
}
