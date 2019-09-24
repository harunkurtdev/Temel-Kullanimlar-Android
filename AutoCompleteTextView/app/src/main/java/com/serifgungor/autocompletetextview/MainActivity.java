package com.serifgungor.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView mactv;
    AutoCompleteTextView actv;

    ArrayAdapter<String> arrayAdapter;
    String[] sehirler = {"kırıkkale","kırklareli","kırşehir","kırgızistan","ankara","antalya","aksaray","adana","istanbul","istinye"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mactv = findViewById(R.id.mactv);
        actv = findViewById(R.id.actv);

        arrayAdapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                sehirler
        );

        mactv.setAdapter(arrayAdapter);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        actv.setAdapter(arrayAdapter);
        actv.setThreshold(1); //Kaç karakterden sonra öneri sunsun


    }
}
