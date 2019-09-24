package com.serifgungor.spinnerkullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    LinearLayout linearLayout;

    ArrayAdapter<String> arrayAdapter;
    String[] sehirler = {"İstanbul","Ankara","İzmir","Bursa","Çanakkale","Kütahya"};


    public void textViewUret(String str){
        /*
        Programatik olarak linearLayout nesnesine yeni bir textview nesnesi üretir.
         */
        TextView textView = new TextView(getApplicationContext());
        textView.setText(str);
        textView.setTextSize(24);
        linearLayout.addView(textView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        linearLayout = findViewById(R.id.linearLayout);

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,sehirler);

        /*
        simple_spinner_item - Aralar çok dar
        android.R.layout.simple_spinner_dropdown_item - Araları geniş
        ArrayAdapter, BaseAdapter

        String dizisi içerisindeki değerleri yada xml dizisi içerisindeki veya
        Arraylist içerisindeki değerleri ilgili nesnelerde gösterebilmek için kullanılan
        bir sınıftır.

         */
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                textViewUret(sehirler[position]);

                        /*
                Toast.makeText(
                        getApplicationContext(),
                        sehirler[position],
                        Toast.LENGTH_LONG
                ).show();
                */

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
