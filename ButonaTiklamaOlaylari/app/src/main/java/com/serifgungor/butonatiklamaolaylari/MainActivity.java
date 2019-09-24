package com.serifgungor.butonatiklamaolaylari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"BUTON 1'e tıklandı",Toast.LENGTH_SHORT).show();
                Log.d("TEST_CLICK","BUTON 1'e tıklandı");
            }
        });

        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //Toast.makeText(getApplicationContext(),"BUTON 2'e uzun basıldı",Toast.LENGTH_SHORT).show();
                Log.d("TEST_LONGCLICK","BUTON 2'e uzun basıldı");
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Log.d("TEST_TOUCH",""+event.toString());

                return false;
            }
        });







    }
}
