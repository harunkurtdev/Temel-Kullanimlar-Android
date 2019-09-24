package com.serifgungor.intentkullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*
        Bir önceki sayfadan intent.putExtra metodu ile gönderilen değerlerin yakalanması için kullanılır.
         */

        String ad = getIntent().getStringExtra("ad");
        String soyad = getIntent().getStringExtra("soyad");

        setTitle(ad+" "+soyad);
    }
}
