package com.serifgungor.webviewnesnesikullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.loadUrl("https://google.com");
        // Hangi tarayıcı üzerinde görüntülensin sorusunu engellemek için kullandık.
        webView.setWebViewClient(new WebViewClient());

        // Web sayfasının bağlığını toolbar'a yazdık
       // setTitle(webView.getTitle());

        // Web sayfasındaki javascript desteğini etkinleştirir.
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        /*
        Tarayıcıya ait sürüm ve dil bilgilerini döndürür.
        webView.getSettings().getUserAgentString();
        */
        



    }
}
