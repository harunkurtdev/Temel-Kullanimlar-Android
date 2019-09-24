package com.serifgungor.hesaplamaornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etSayi1,etSayi2;
    Button btnTopla,btnCikar,btnCarp,btnBol;
    TextView tvSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSonuc = findViewById(R.id.tvSonuc);
        btnTopla = findViewById(R.id.btnTopla);
        btnCikar = findViewById(R.id.btnCikar);
        btnCarp = findViewById(R.id.btnCarp);
        btnBol = findViewById(R.id.btnBol);
        etSayi1 = findViewById(R.id.etSayi1);
        etSayi2 = findViewById(R.id.etSayi2);

        btnCikar.setOnClickListener(this);
        btnCarp.setOnClickListener(this);
        btnBol.setOnClickListener(this);
        btnTopla.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        /*
        View sınıfı tıklayan nesnenin bilgilerini içerir.

        Edittext nesnesi içerisinden gelen tüm değerler String'dir.
         */

        int sayi1 = Integer.valueOf(etSayi1.getText().toString());
        int sayi2 = Integer.valueOf(etSayi2.getText().toString());
        int sonuc = 0;

        switch (v.getId()){
            case R.id.btnTopla:
                sonuc = sayi1+sayi2;
                break;
            case R.id.btnCikar:
                sonuc = sayi1-sayi2;
                break;
            case R.id.btnBol:
                sonuc = sayi1/sayi2;
                break;
            case R.id.btnCarp:
                sonuc = sayi1*sayi2;
                break;
        }

        tvSonuc.setText(""+sonuc);

    }
}
