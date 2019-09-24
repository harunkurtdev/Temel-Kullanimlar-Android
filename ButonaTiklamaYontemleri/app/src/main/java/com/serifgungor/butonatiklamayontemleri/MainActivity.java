package com.serifgungor.butonatiklamayontemleri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnAraba,btnSaat,btnTelefon;

    @Override
    public void onClick(View v) {
        /*
        if(v.getId()==R.id.btnAraba){

        }else if(v.getId()==R.id.btnSaat){

        }else if(v.getId()==R.id.btnTelefon){

        }*/
        switch (v.getId()){
            case R.id.btnAraba:
                Toast.makeText(getApplicationContext(),"ARABA",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSaat:
                Toast.makeText(getApplicationContext(),"SAAT",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTelefon:
                Toast.makeText(getApplicationContext(),"TELEFON",Toast.LENGTH_SHORT).show();
                break;
        }


    }

    public void butonaTikla(View view){
        /*
        XML tarafında bir butona tıklama olayını bağlayabilmek için
        metot View sınıfı argümanı içermelidir.
        android:onClick="butonaTikla"
         */
        Log.d("BUTONA_TIKLAMA","BUTONA TIKLANDI");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAraba = findViewById(R.id.btnAraba);
        btnTelefon = findViewById(R.id.btnTelefon);
        btnSaat = findViewById(R.id.btnSaat);

        btnAraba.setOnClickListener(this);
        btnTelefon.setOnClickListener(this);
        btnSaat.setOnClickListener(this);


    }


}
