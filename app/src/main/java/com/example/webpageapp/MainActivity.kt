package com.example.webpageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var web_view:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val web_view = findViewById<WebView>(R.id.ac_main_wv)
        web_view.loadUrl("https://samyad.tvu.ac.ir/")
        web_view.webViewClient = WebViewClient()
        web_view.webChromeClient = WebChromeClient()

        web_view.settings.javaScriptEnabled = true
        web_view.settings.domStorageEnabled = true

    }

    override fun onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack()
        }else{
            super.onBackPressed()
        }


    }



}