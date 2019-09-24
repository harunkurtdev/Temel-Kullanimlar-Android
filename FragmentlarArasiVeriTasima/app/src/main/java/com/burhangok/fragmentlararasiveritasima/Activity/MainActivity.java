package com.burhangok.fragmentlararasiveritasima.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.burhangok.fragmentlararasiveritasima.Fragment.FragmentSayfa1;
import com.burhangok.fragmentlararasiveritasima.Fragment.FragmentSayfa2;
import com.burhangok.fragmentlararasiveritasima.R;

public class MainActivity extends AppCompatActivity implements FragmentSayfa1.VeriTasi {

    public void icerigiDegistir(int resId,Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(resId,fragment);
        ft.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icerigiDegistir(R.id.frameLayout1,new FragmentSayfa1());
        icerigiDegistir(R.id.frameLayout2,new FragmentSayfa2());
    }

    @Override
    public void tasinacakYazi(String yazi) {
        //Toast.makeText(getApplicationContext(),yazi,Toast.LENGTH_LONG).show();
        FragmentSayfa2 fragment = new FragmentSayfa2();
        fragment.gelenMesajiYakala(yazi);
        icerigiDegistir(R.id.frameLayout2,fragment);
    }
}
