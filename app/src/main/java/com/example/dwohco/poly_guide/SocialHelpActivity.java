package com.example.dwohco.poly_guide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class SocialHelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_help);
        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.back:
                                Intent intentBack = new Intent(SocialHelpActivity.this, InfoActivity.class);
                                startActivity(intentBack);
                                return true;
                            case R.id.home:
                                Intent intent = new Intent(SocialHelpActivity.this, MainActivity.class);
                                startActivity(intent);
                                return true;
                            case R.id.search:

                        }
                        return false;
                    }
                });
    }
    public int key;
    public void a (View view) {
        Intent intentA = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 8;
        intentA.putExtra("key", key);
        startActivity (intentA);
    }

    public void b (View view) {
        Intent intentB = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 9;
        intentB.putExtra("key", key);
        startActivity (intentB);
    }

    public void c (View view) {
        Intent intentC = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 10;
        intentC.putExtra("key", key);
        startActivity (intentC);
    }

    public void d (View view) {
        Intent intentD = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 11;
        intentD.putExtra("key", key);
        startActivity (intentD);
    }

    public void e (View view) {
        Intent intentE = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 12;
        intentE.putExtra("key", key);
        startActivity (intentE);
    }

    public void f (View view) {
        Intent intentF = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 13;
        intentF.putExtra("key", key);
        startActivity (intentF);
    }

    public void g (View view) {
        Intent intentG = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 14;
        intentG.putExtra("key", key);
        startActivity (intentG);
    }

    public void h (View view) {
        Intent intentH = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 15;
        intentH.putExtra("key", key);
        startActivity (intentH);
    }

    public void i (View view) {
        Intent intentI = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 16;
        intentI.putExtra("key", key);
        startActivity (intentI);
    }

    public void j (View view) {
        Intent intentJ = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 17;
        intentJ.putExtra("key", key);
        startActivity (intentJ);
    }

    public void k (View view) {
        Intent intentK = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 18;
        intentK.putExtra("key", key);
        startActivity (intentK);
    }

    public void l (View view) {
        Intent intentL = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 19;
        intentL.putExtra("key", key);
        startActivity (intentL);
    }

    public void m (View view) {
        Intent intentM = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 20;
        intentM.putExtra("key", key);
        startActivity (intentM);
    }

    public void n (View view) {
        Intent intentN = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 21;
        intentN.putExtra("key", key);
        startActivity (intentN);
    }

    public void o (View view) {
        Intent intentO = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 22;
        intentO.putExtra("key", key);
        startActivity (intentO);
    }

    public void p (View view) {
        Intent intentP = new Intent(SocialHelpActivity.this, ConcreteInfoSocialActivity.class);
        key = 23;
        intentP.putExtra("key", key);
        startActivity (intentP);
    }
}
