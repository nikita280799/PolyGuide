package com.example.dwohco.poly_guide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import org.xml.sax.XMLReader;

public class ConcreteInfoSocialActivity extends AppCompatActivity {

    TextView infoSocial, titleSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concrete_info_social);

        infoSocial = findViewById(R.id.infoSocial);
        titleSocial = findViewById(R.id.title);
        Intent intent = getIntent();

        String htmlSocialSettlement  =  getString(R.string.social_settlement);
        String htmlSocialHostel = getString(R.string.social_hostel);
        String htmlSocialRelax = getString(R.string.social_relax);
        String htmlSocialMedical = getString(R.string.social_medical);
        String htmlSocialGrant = getString(R.string.social_grant);
        String htmlSocialArmy = getString(R.string.social_army);
        String htmlSocialTrip = getString(R.string.social_trip);
        String htmlSupportA = getString(R.string.text_support_a);
        String htmlSupportB = getString(R.string.text_support_b);
        String htmlSupportC = getString(R.string.text_support_c);
        String htmlSupportD = getString(R.string.text_support_d);
        String htmlSupportE = getString(R.string.text_support_e);
        String htmlSupportF = getString(R.string.text_support_f);
        String htmlSupportG = getString(R.string.text_support_g);
        String htmlSupportH = getString(R.string.text_support_h);
        String htmlSupportI = getString(R.string.text_support_i);
        String htmlSupportJ = getString(R.string.text_support_j);
        String htmlSupportK = getString(R.string.text_support_k);
        String htmlSupportL = getString(R.string.text_support_l);
        String htmlSupportM = getString(R.string.text_support_m);
        String htmlSupportN = getString(R.string.text_support_n);
        String htmlSupportO = getString(R.string.text_support_o);
        String htmlSupportP = getString(R.string.text_support_p);
        String htmlDoc = getString(R.string.text_doc);
        String htmlBefore = getString(R.string.info_before);
        String htmlAfter = getString(R.string.info_after);
        String htmlPortal = getString(R.string.info_portal);

        Spanned readySocialSettlement  =  Html.fromHtml(htmlSocialSettlement);
        Spanned readySocialHostel = Html.fromHtml(htmlSocialHostel);
        Spanned readySocialRelax = Html.fromHtml(htmlSocialRelax);
        Spanned readySocialMedical = Html.fromHtml(htmlSocialMedical);
        Spanned readySocialGrant = Html.fromHtml(htmlSocialGrant);
        Spanned readySocialArmy = Html.fromHtml(htmlSocialArmy);
        Spanned readySocialTrip = Html.fromHtml(htmlSocialTrip);
        Spanned readySupportA = Html.fromHtml(htmlSupportA);
        Spanned readySupportB = Html.fromHtml(htmlSupportB);
        Spanned readySupportC = Html.fromHtml(htmlSupportC);
        Spanned readySupportD = Html.fromHtml(htmlSupportD);
        Spanned readySupportE = Html.fromHtml(htmlSupportE);
        Spanned readySupportF = Html.fromHtml(htmlSupportF);
        Spanned readySupportG = Html.fromHtml(htmlSupportG);
        Spanned readySupportH = Html.fromHtml(htmlSupportH);
        Spanned readySupportI = Html.fromHtml(htmlSupportI);
        Spanned readySupportJ = Html.fromHtml(htmlSupportJ);
        Spanned readySupportK = Html.fromHtml(htmlSupportK);
        Spanned readySupportL = Html.fromHtml(htmlSupportL);
        Spanned readySupportM = Html.fromHtml(htmlSupportM);
        Spanned readySupportN = Html.fromHtml(htmlSupportN);
        Spanned readySupportO = Html.fromHtml(htmlSupportO);
        Spanned readySupportP = Html.fromHtml(htmlSupportP);
        Spanned readyDoc = Html.fromHtml(htmlDoc);
        Spanned readyBefore = Html.fromHtml(htmlBefore);
        Spanned readyAfter = Html.fromHtml(htmlAfter);
        Spanned readyPortal = Html.fromHtml(htmlPortal);

        int key = intent.getIntExtra("key", 100);

        switch (key) {
            case 0:
                titleSocial.setText(R.string.title_settlement);
                infoSocial.setText(readySocialSettlement);
                break;
            case 1:
                titleSocial.setText(R.string.hostel);
                infoSocial.setText(readySocialHostel);
                break;
            case 2:
                titleSocial.setText(R.string.relax);
                infoSocial.setText(readySocialRelax);
                break;
            case 3:
                titleSocial.setText(R.string.medical);
                infoSocial.setText(readySocialMedical);
                break;
            case 4:
                titleSocial.setText(R.string.grant);
                infoSocial.setText(readySocialGrant);
                break;
            case 5:
                titleSocial.setText(R.string.army);
                infoSocial.setText(readySocialArmy);
                break;
            case 6:
                titleSocial.setText(R.string.title_trip);
                infoSocial.setText(readySocialTrip);
                break;
            case 7:
                Intent intentInfo = new Intent(ConcreteInfoSocialActivity.this, SocialHelpActivity.class);
                startActivity (intentInfo);
                break;
            case 8:
                titleSocial.setText(R.string.title_support_a);
                infoSocial.setText(readySupportA);
                break;
            case 9:
                titleSocial.setText(R.string.support_b);
                infoSocial.setText(readySupportB);
                break;
            case 10:
                titleSocial.setText(R.string.support_c);
                infoSocial.setText(readySupportC);
                break;
            case 11:
                titleSocial.setText(R.string.support_d);
                infoSocial.setText(readySupportD);
                break;
            case 12:
                titleSocial.setText(R.string.support_e);
                infoSocial.setText(readySupportE);
                break;
            case 13:
                titleSocial.setText(R.string.support_f);
                infoSocial.setText(readySupportF);
                break;
            case 14:
                titleSocial.setText(R.string.support_g);
                infoSocial.setText(readySupportG);
                break;
            case 15:
                titleSocial.setText(R.string.support_h);
                infoSocial.setText(readySupportH);
                break;
            case 16:
                titleSocial.setText(R.string.support_i);
                infoSocial.setText(readySupportI);
                break;
            case 17:
                titleSocial.setText(R.string.support_j);
                infoSocial.setText(readySupportJ);
                break;
            case 18:
                titleSocial.setText(R.string.support_k);
                infoSocial.setText(readySupportK);
                break;
            case 19:
                titleSocial.setText(R.string.support_l);
                infoSocial.setText(readySupportL);
                break;
            case 20:
                titleSocial.setText(R.string.support_m);
                infoSocial.setText(readySupportM);
                break;
            case 21:
                titleSocial.setText(R.string.support_n);
                infoSocial.setText(readySupportN);
                break;
            case 22:
                titleSocial.setText(R.string.support_o);
                infoSocial.setText(readySupportO);
                break;
            case 23:
                titleSocial.setText(R.string.support_p);
                infoSocial.setText(readySupportP);
                break;
            case 24:
                titleSocial.setText(R.string.title_doc);
                infoSocial.setText(readyDoc);
                break;
            case 25:
                titleSocial.setText(R.string.before);
                infoSocial.setText(readyBefore);
                break;
            case 26:
                titleSocial.setText(R.string.after);
                infoSocial.setText(readyAfter);
                break;
            case 27:
                titleSocial.setText(R.string.title_portal);
                infoSocial.setText(readyPortal);
                break;
        }
    }
    public void backSocial (View view) {
        finish();
    }
}
