package com.serifgungor.glidekutuphanesiileresimyukleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    Button btn;
    String[] resimler = {"https://upload.wikimedia.org/wikipedia/commons/6/69/MV_Columbia_Left_Side_Evening_2048px.jpg","https://www.garenta.com.tr/blog/wp-content/uploads/2018/09/bir-istanbul-guzellemesi-sultan-ahmet-camii.jpg","https://gezipgordum.com/wp-content/uploads/2017/10/istanbul-fatih-camii-ici.jpg","https://gezipgordum.com/wp-content/uploads/2015/10/suleymaniye-camii-640x360.jpg"};
    int sayac = 0;

    @Override
    public void onClick(View v) {

        Glide
                .with(getApplicationContext())
                .load(resimler[sayac])
                .into(imageView);
        if(sayac==resimler.length-1){
            sayac=0;
        }else{
            sayac += 1;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }


}
