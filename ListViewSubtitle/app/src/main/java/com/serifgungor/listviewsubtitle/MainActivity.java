package com.serifgungor.listviewsubtitle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    SimpleAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] basliklar = {
                "BAŞLIK 1", "BAŞLIK 2", "BAŞLIK 3"
        };
        String[] altBasliklar = {
                "ALT BAŞLIK 1", "ALT BAŞLIK 2", "ALT BAŞLIK 3"
        };

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
        for (int i = 0; i < basliklar.length; i++) {
            Map<String, String> datum = new HashMap<String, String>(2);
            datum.put("title", basliklar[i]);
            datum.put("subtitle", altBasliklar[i]);
            data.add(datum);
        }
        adapter = new SimpleAdapter(getApplicationContext(),
                data, android.R.layout.simple_list_item_2,
                new String[]{"title", "subtitle"},
                new int[]{android.R.id.text1,
                        android.R.id.text2});

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
