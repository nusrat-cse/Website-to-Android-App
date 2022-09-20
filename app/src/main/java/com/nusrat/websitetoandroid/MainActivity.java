package com.nusrat.websitetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
 WebView mWebView;
 //Global Variable Declare
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.mWebView);
        //Introduce with that variable by Id
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://ismailciucse.github.io/web-project-v2/");
    }
}


