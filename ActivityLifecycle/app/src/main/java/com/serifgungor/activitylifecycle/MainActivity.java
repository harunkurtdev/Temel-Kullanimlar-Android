package com.serifgungor.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("YAŞAMDÖNGÜSÜ","onCreate metodu çalıştı");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("YAŞAMDÖNGÜSÜ","onStart metodu çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("YAŞAMDÖNGÜSÜ","onStop metodu çalıştı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("YAŞAMDÖNGÜSÜ","onDestroy metodu çalıştı");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("YAŞAMDÖNGÜSÜ","onPause metodu çalıştı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("YAŞAMDÖNGÜSÜ","onResume metodu çalıştı");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("YAŞAMDÖNGÜSÜ","onRestart metodu çalıştı");
    }
}
