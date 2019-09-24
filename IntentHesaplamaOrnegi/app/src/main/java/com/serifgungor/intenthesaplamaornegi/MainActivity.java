package com.serifgungor.intenthesaplamaornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etSayi1,etSayi2;
    Button btnTopla,btnCikar,btnCarp,btnBol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSayi1 = findViewById(R.id.etSayi1);
        etSayi2 = findViewById(R.id.etSayi2);

        btnTopla = findViewById(R.id.btnTopla);
        btnCikar = findViewById(R.id.btnCikar);
        btnCarp = findViewById(R.id.btnCarp);
        btnBol = findViewById(R.id.btnBol);

        btnTopla.setOnClickListener(this);
        btnCikar.setOnClickListener(this);
        btnCarp.setOnClickListener(this);
        btnBol.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = null;
        int sayi1 = Integer.parseInt(etSayi1.getText().toString());
        int sayi2 = Integer.parseInt(etSayi2.getText().toString());
        int sonuc = 0;
        switch (v.getId()){
            case R.id.btnTopla:
                sonuc = sayi1+sayi2;
                intent.putExtra("sonuc",sonuc);
                intent.putExtra("islem","toplama");
                break;
            case R.id.btnCarp:
                sonuc = sayi1+sayi2;
                intent.putExtra("sonuc",sonuc);
                intent.putExtra("islem","çarpma");
                break;
            case R.id.btnCikar:
                sonuc = sayi1*sayi2;
                intent.putExtra("sonuc",sonuc);
                intent.putExtra("islem","çıkarma");
                break;
            case R.id.btnBol:
                sonuc = sayi1/sayi2;
                intent.putExtra("sonuc",sonuc);
                intent.putExtra("islem","bölme");
                break;
        }
        startActivity(intent);
    }
}
