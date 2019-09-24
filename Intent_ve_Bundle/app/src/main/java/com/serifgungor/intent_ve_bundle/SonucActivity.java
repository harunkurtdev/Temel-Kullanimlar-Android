package com.serifgungor.intent_ve_bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SonucActivity extends AppCompatActivity {

    ImageView ivSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        ivSonuc = findViewById(R.id.ivSonuc);

        String hayvan = getIntent().getStringExtra("hayvan");


        if("aslan".equals(hayvan)){
            ivSonuc.setImageResource(R.drawable.aslan);
        }else if("kedi".equals(hayvan)){
            ivSonuc.setImageResource(R.drawable.kedi);
        }else if("köpek".equals(hayvan)){
            ivSonuc.setImageResource(R.drawable.kopek);
        }else if("penguen".equals(hayvan)){
            ivSonuc.setImageResource(R.drawable.penguen);
        }

    }
}
