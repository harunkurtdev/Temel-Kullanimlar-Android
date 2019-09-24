package com.serifgungor.listviewkullanimi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> yazilimDiller = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yazilimDiller.add("JAVA");
        yazilimDiller.add("Python");
        yazilimDiller.add("C++");
        yazilimDiller.add("Objective C");
        yazilimDiller.add("Ruby on Rails");
        yazilimDiller.add("Kotlin");
        yazilimDiller.add("Swift");
        yazilimDiller.add("PHP");
        yazilimDiller.add("C#");
        yazilimDiller.add("Visual Basic .NET");
        yazilimDiller.add("JavaScript");
        yazilimDiller.add("SQL");

        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                yazilimDiller
        );
        listView.setAdapter(arrayAdapter);

        //Eleman'a tıklama olayı
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Toast.makeText(getApplicationContext(),yazilimDiller.get(position),Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            intent.putExtra("isim",yazilimDiller.get(position));
            startActivity(intent);


        }
    });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

                AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                adb.setMessage("Elemanı silmek istiyor musunuz ?");
                adb.setTitle("Veri silinsin mi ?");
                adb.setNegativeButton("HAYIR",null);
                adb.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //Arraylist'den değeri sil, adapter'ı yenile

                        //Arraylistteki ilgili indisi siler
                        yazilimDiller.remove(position);

                        //ListView değerleri değiştiği için adapter'i yenile
                        arrayAdapter.notifyDataSetChanged();

                    }
                });
                adb.setNeutralButton("İPTAL",null);
                adb.show();








                return false;
            }
        });




    }
}
