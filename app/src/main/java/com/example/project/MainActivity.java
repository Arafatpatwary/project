package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=(WebView)findViewById(R.id.webid);

        WebSettings webSettings= web.getSettings();
        webSettings.setJavaScriptEnabled(true);


        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://www.lus.ac.bd/");


    }
}
