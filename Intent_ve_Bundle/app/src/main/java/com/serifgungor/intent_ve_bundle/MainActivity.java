package com.serifgungor.intent_ve_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivKedi,ivKopek,ivAslan,ivPenguen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAslan = findViewById(R.id.ivAslan);
        ivKedi = findViewById(R.id.ivKedi);
        ivPenguen = findViewById(R.id.ivPenguen);
        ivKopek = findViewById(R.id.ivKopek);

        ivKopek.setOnClickListener(this);
        ivAslan.setOnClickListener(this);
        ivPenguen.setOnClickListener(this);
        ivKedi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),SonucActivity.class);
        switch (v.getId()){
            case R.id.ivKopek:
                intent.putExtra("hayvan","köpek");
                break;
            case R.id.ivAslan:
                intent.putExtra("hayvan","aslan");
                break;
            case R.id.ivPenguen:
                intent.putExtra("hayvan","penguen");
                break;
            case R.id.ivKedi:
                intent.putExtra("hayvan","kedi");
                break;
        }
        startActivity(intent);
    }
}
