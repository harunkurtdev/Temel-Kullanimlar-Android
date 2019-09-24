package com.google.yazibirlestirme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnBirlestir;
    TextView tvSonuc;
    EditText etAd,etSoyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBirlestir = findViewById(R.id.btnBirlestir);
        tvSonuc = findViewById(R.id.tvSonuc);
        etAd = findViewById(R.id.etAd);
        etSoyad = findViewById(R.id.etSoyad);

        btnBirlestir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                Edittext nesnesinin içerisindeki yazıyı yakalayabilmek için getText().toString()
                kullanılır.
                */
                String adSoyad = etAd.getText().toString() + " " + etSoyad.getText().toString();
                /*
                nesnenin görünür yazısını değiştirmek için setText() kullanılır.
                 */
                tvSonuc.setText(adSoyad);
                etAd.setText("");
                etSoyad.setText("");

            }
        });


    }
}
