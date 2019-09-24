package com.serifgungor.checkbox_radiobutton_togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox chkMavi, chkKirmizi, chkYesil;

    RadioButton rdLise, rdLisans, rdOnLisans, rdYLisans, rdDoktora;

    Switch sw;
    ToggleButton toggleButton;

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        switch (buttonView.getId()) {
            case R.id.rdButonDoktora:
                Toast.makeText(getApplicationContext(),"Tıklanan değer: Doktora",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rdButonLisans:
                Toast.makeText(getApplicationContext(),"Tıklanan değer: Lisans",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rdButonLise:
                Toast.makeText(getApplicationContext(),"Tıklanan değer: Lise",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rdButonOnLisans:
                Toast.makeText(getApplicationContext(),"Tıklanan değer: Ön Lisans",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rdButonYuksekLisans:
                Toast.makeText(getApplicationContext(),"Tıklanan değer: Yüksek Lisans",Toast.LENGTH_SHORT).show();
                break;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkYesil = findViewById(R.id.chkYesil);
        chkMavi = findViewById(R.id.chkMavi);
        chkKirmizi = findViewById(R.id.chkKirmizi);


        rdLisans = findViewById(R.id.rdButonLisans);
        rdLise = findViewById(R.id.rdButonLise);
        rdOnLisans = findViewById(R.id.rdButonOnLisans);
        rdYLisans = findViewById(R.id.rdButonYuksekLisans);
        rdDoktora = findViewById(R.id.rdButonDoktora);

        rdLisans.setOnCheckedChangeListener(this);
        rdLise.setOnCheckedChangeListener(this);
        rdOnLisans.setOnCheckedChangeListener(this);
        rdYLisans.setOnCheckedChangeListener(this);
        rdDoktora.setOnCheckedChangeListener(this);


        sw = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),"Swich seçili durumda",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Swich seçili durumda değil",Toast.LENGTH_SHORT).show();
                }

            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(getApplicationContext(),"Toggle Button seçili durumda",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Toggle Button seçili durumda değil",Toast.LENGTH_SHORT).show();
                }

            }
        });


        chkMavi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("DURUM", "MAVİ:" + isChecked);
            }
        });

        chkKirmizi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("DURUM", "KIRMIZI:" + isChecked);
            }
        });

        chkYesil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Log.d("DURUM", "Yeşil, sevdiğim renktir.");
                } else {
                    Log.d("DURUM", "Yeşil, sevdiğim renk değildir.");
                }
            }
        });


    }


}
