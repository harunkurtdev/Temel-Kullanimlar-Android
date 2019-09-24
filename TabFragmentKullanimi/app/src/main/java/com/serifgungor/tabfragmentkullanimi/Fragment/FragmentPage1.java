package com.serifgungor.tabfragmentkullanimi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.serifgungor.tabfragmentkullanimi.R;

public class FragmentPage1 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /*
        Activity sınıfının onCreate metodu ile aynı işlevdedir.
         */

        View v = inflater.inflate(R.layout.fragment_page1,null);
        //Fragment sınıfını layout'a bağladık;
        //layout'u gösterdik.
        return v;
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        /*
        nesne tanımlamaları ve nesnelerin olayları onViewCreated üzerinde tanımlanmalıdır.
         */

        final EditText etSayi1,etSayi2;
        Button btnHesapla;

        etSayi1 = view.findViewById(R.id.etSayi1);
        etSayi2 = view.findViewById(R.id.etSayi2);
        btnHesapla = view.findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sonuc = 0;
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                sonuc = sayi1+sayi2;

                Toast.makeText(view.getContext(),"Sonuç: "+sonuc,Toast.LENGTH_LONG).show();

            }
        });

    }
}
