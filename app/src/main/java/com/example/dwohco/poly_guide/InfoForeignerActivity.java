package com.example.dwohco.poly_guide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class InfoForeignerActivity extends AppCompatActivity {
    TextView infoForeign, titleForeign;
    public int key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_foreigner);

        infoForeign = findViewById(R.id.foreign);
        titleForeign = findViewById(R.id.titleForeign);
        String htmlForeign = getString(R.string.info_for_foreigner);
        Spanned readyForeign = Html.fromHtml(htmlForeign);

        infoForeign.setText(readyForeign);
        titleForeign.setText(R.string.title_foreign);
    }
    public void backInfo (View view) {
        finish();
    }

    public void before (View view) {
        Intent intentGrant = new Intent(InfoForeignerActivity.this, ConcreteInfoSocialActivity.class);
        key = 25;
        intentGrant.putExtra("key", key);
        startActivity (intentGrant);
    }

    public void after (View view) {
        Intent intentGrant = new Intent(InfoForeignerActivity.this, ConcreteInfoSocialActivity.class);
        key = 26;
        intentGrant.putExtra("key", key);
        startActivity (intentGrant);
    }
}
