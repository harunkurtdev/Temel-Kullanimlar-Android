package com.serifgungor.intentyasornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.etSayi);
        btn = findViewById(R.id.btnGonder);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SonucActivity.class);
                //Edittextdeki değeri integera çevirip SonucActivity'e gönderdikç
                i.putExtra("yas",Integer.parseInt(editText.getText().toString()));
                //Sonuc activity sayfasını açtık
                startActivity(i);
            }
        });
    }
}
