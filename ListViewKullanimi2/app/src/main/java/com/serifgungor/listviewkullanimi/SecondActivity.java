package com.serifgungor.listviewkullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String baslik = getIntent().getStringExtra("isim");
        textView = findViewById(R.id.textView);
        textView.setText(baslik);
    }
}
