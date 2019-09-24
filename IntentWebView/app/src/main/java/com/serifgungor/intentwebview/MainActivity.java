package com.serifgungor.intentwebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etWebsite;
    Button btnGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWebsite = findViewById(R.id.etWebsite);
        btnGit = findViewById(R.id.btnGit);

        btnGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Butona tıklanınca WebActivity sayfası açılır.
                Intent intent = new Intent(getApplicationContext(),WebActivity.class);
                //Açılacak sayfaya gönderilecek değer
                intent.putExtra("weburl",etWebsite.getText().toString());
                //Activity sayfasını açmak için startActivity metodu kullanılır.
                startActivity(intent);

            }
        });
    }
}
