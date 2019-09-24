package com.burhangok.fragmentlararasiveritasima.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.burhangok.fragmentlararasiveritasima.R;

import java.io.IOException;

public class FragmentSayfa1 extends Fragment {

    VeriTasi veriTasi;
    public interface VeriTasi{
        void tasinacakYazi(String yazi);
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sayfa1,null);

        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        Button btnGonder = view.findViewById(R.id.btnGonder);
        final EditText etAdSoyad = view.findViewById(R.id.etAdSoyad);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veriTasi.tasinacakYazi(etAdSoyad.getText().toString());
            }
        });

        /*
        try {
            deneme();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    /*
    public void deneme() throws IOException {
    }
    */

    @Override
    public void onAttach(Context context) {
        //İNTERFACE CLASS'INI FRAGMENT İLE BAĞLADIK.
        /*
        onAttach metodu sayesinde interface'in tanımlanıp, değer ataması yapılır.
         */
        super.onAttach(context);
        try {
            veriTasi = (VeriTasi) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }
}
