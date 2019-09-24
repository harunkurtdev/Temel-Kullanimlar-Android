package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    static int BEKLEME_SURESI = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Bekle().start();
    }

    private class Bekle extends Thread{
        @Override
        public void run() {
            try{
                Thread.sleep(BEKLEME_SURESI);
            }catch (Exception e){
            }
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish(); // KALICI OLARAK ACTİVİTY KAPATILIR.
        }
    }
}
