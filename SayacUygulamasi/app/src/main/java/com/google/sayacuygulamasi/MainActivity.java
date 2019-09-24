package com.google.sayacuygulamasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    int sayac=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);

        tv.setText("0");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac += 1;
                tv.setText(""+sayac);

                // sayı 25'e ulaşınca sıfırla
                if(sayac==25){
                    sayac = 0;
                }

            }
        });
    }
}
