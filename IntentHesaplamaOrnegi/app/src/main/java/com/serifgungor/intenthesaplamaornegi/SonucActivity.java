package com.serifgungor.intenthesaplamaornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {

    TextView tvSonuc,tvIslem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        tvIslem = findViewById(R.id.tvIslem);
        tvSonuc = findViewById(R.id.tvSonuc);

        String islem = getIntent().getStringExtra("islem");
        int sonuc = getIntent().getIntExtra("sonuc",0);

        tvIslem.setText(islem);
        tvSonuc.setText(""+sonuc);
    }
}
