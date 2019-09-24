package com.serifgungor.navigationdrawerkullanimi.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import com.serifgungor.navigationdrawerkullanimi.Fragment.FragmentIletisim;
import com.serifgungor.navigationdrawerkullanimi.Fragment.FragmentPaylas;
import com.serifgungor.navigationdrawerkullanimi.Fragment.FragmentResimPaylas;
import com.serifgungor.navigationdrawerkullanimi.Fragment.FragmentYaziPaylas;
import com.serifgungor.navigationdrawerkullanimi.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    public void goruntuyuDegistir(Fragment fragment){
        /*
        FragmentTransaction sınıfı sayesinde id'sini bildiğimiz bir frameLayout
        nesnesine fragment tipinde değer gönderirsek o fragment'a ait layout'ı
        framelayout nesnesinde gösterir.
         */
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
        ft.commit();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);



        goruntuyuDegistir(new FragmentIletisim());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //Navigation Item'ların tıklama olayını yakalamak
        int id = item.getItemId();
        switch (id){
            case R.id.nav_iletisim:
                //Toast.makeText(getApplicationContext(),"İletişim",Toast.LENGTH_LONG).show();
                goruntuyuDegistir(new FragmentIletisim());
                break;
            case R.id.nav_paylas:
                //Toast.makeText(getApplicationContext(),"Paylaş",Toast.LENGTH_LONG).show();
                goruntuyuDegistir(new FragmentPaylas());
                break;
            case R.id.nav_resimpaylas:
                //Toast.makeText(getApplicationContext(),"Resim Paylaş",Toast.LENGTH_LONG).show();
                goruntuyuDegistir(new FragmentResimPaylas());
                break;
            case R.id.nav_yazipaylas:
                //Toast.makeText(getApplicationContext(),"Yazı Paylaş",Toast.LENGTH_LONG).show();
                goruntuyuDegistir(new FragmentYaziPaylas());
                break;
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
