package com.google.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //GLOBAL AREA
    Button btnGs, btnFb, btnBjk, btnTs;
    ImageView ivResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        onCreate metodu içerisinde kod tarafında kullanılması gereken tüm
        nesnelerin referansı, findViewById ile bağlanması(tanımlanması) gerekir.
         */

        ivResim = findViewById(R.id.imageView2);
        btnGs = findViewById(R.id.btnGs);
        btnFb = findViewById(R.id.btnFb);
        btnBjk = findViewById(R.id.btnBjk);
        btnTs = findViewById(R.id.btnTs);

        btnGs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivResim.setImageResource(R.drawable.gs);
            }
        });

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivResim.setImageResource(R.drawable.fb);
            }
        });

        btnBjk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivResim.setImageResource(R.drawable.bjk);
            }
        });

        btnTs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivResim.setImageResource(R.drawable.ts);
            }
        });


    }


}
