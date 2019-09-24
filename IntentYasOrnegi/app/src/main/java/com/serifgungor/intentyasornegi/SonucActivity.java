package com.serifgungor.intentyasornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        textView = findViewById(R.id.tvSonuc);
        int yas = getIntent().getIntExtra("yas",0);
        textView.setText("Yaşınız: "+yas);


    }
}
