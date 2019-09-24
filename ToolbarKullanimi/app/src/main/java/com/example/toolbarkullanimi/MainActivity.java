package com.example.toolbarkullanimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TOOLBAR'DA GÖSTERİLEN YAZIYI DEĞİŞTİRDİK
        this.getSupportActionBar().setTitle("BAŞLIK");
        this.getSupportActionBar().setSubtitle("ALT BAŞLIK");
        //GERİ BUTONUNU TOOLBAR'A EKLER
        //this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });

    }

    //MENÜ OLUŞTURMAK İÇİN KULLANILIR.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        //GetMenuInflater Toolbar'a menüyü bağlar
        return true;
    }

    public void yaziGoster(String str){
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }


    //MENÜ İTEM'LERİN TIKLAMA OLAYI
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                yaziGoster("GERİ BUTONUNA TIKLANDI");
                break;
            case R.id.id_googleplay:
                yaziGoster("GOOGLE PLAY");
                break;
            case R.id.id_harita:
                yaziGoster("HARİTA AÇILDI");
                break;
            case R.id.id_iletisim:
                yaziGoster("TELEFON ARANDI");
                break;
            case R.id.id_mailgonder:
                yaziGoster("MAİL GÖNDERİLDİ");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
