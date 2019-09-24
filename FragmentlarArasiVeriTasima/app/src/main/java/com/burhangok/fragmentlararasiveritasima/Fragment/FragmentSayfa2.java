package com.burhangok.fragmentlararasiveritasima.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.burhangok.fragmentlararasiveritasima.R;

public class FragmentSayfa2 extends Fragment {

    TextView tvSonuc;
    String yazi = "";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sayfa2,null);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tvSonuc = view.findViewById(R.id.tvSonuc);
        tvSonuc.setText(yazi);
    }

    public void gelenMesajiYakala(String gelenMesaj){
        //FragmentSayfa1'den veriyi interface ile MainActivity'e taşıdık.
        //MainActivity'den veriyi FragmentSayfa2'ye ulaştırdık.
        yazi = gelenMesaj;
    }
}
