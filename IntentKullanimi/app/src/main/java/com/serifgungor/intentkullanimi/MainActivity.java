package com.serifgungor.intentkullanimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etAd,etSoyad;
    Button btnGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSoyad = findViewById(R.id.etSoyad);
        etAd = findViewById(R.id.etAd);
        btnGiris = findViewById(R.id.btnGonder);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("ad",etAd.getText().toString());
                intent.putExtra("soyad",etSoyad.getText().toString());

                //diğer sayfanın açılması işlemini sağlar.
                startActivity(intent);

                // startActivity(new Intent(getApplicationContext(),SecondActivity.class));
                //Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

            }
        });


    }
}
