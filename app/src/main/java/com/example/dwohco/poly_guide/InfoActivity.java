package com.example.dwohco.poly_guide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.back:
                                Intent intentBack = new Intent(InfoActivity.this, MainActivity.class);
                                startActivity(intentBack);
                                return true;
                            case R.id.home:
                                Intent intent = new Intent(InfoActivity.this, MainActivity.class);
                                startActivity(intent);
                                return true;
                            case R.id.search:

                        }
                        return false;
                    }
                });
    }
    public void help (View view) {
        Intent intentInfo = new Intent(InfoActivity.this, InfoSocialActivity.class);
        startActivity (intentInfo);
    }

    public int key;
    public void doc (View view) {
        Intent intentDoc = new Intent(InfoActivity.this, ConcreteInfoSocialActivity.class);
        key = 24;
        intentDoc.putExtra("key", key);
        startActivity (intentDoc);
    }

    public void support (View view) {
        Intent intentSupport = new Intent(InfoActivity.this, ConcreteInfoSocialActivity.class);
        key = 7;
        intentSupport.putExtra("key", key);
        startActivity (intentSupport);
    }

    public void foreign (View view) {
        Intent intentForeign = new Intent(InfoActivity.this, InfoForeignerActivity.class);
        startActivity (intentForeign);
    }

    public void portal (View view) {
        Intent intentPortal = new Intent(InfoActivity.this, ConcreteInfoSocialActivity.class);
        key = 27;
        intentPortal.putExtra("key", key);
        startActivity (intentPortal);
    }
}
