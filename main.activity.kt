package com.example.myapplication

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the WebView as the content view
        val webView = WebView(this)
        setContentView(webView)

        // Configure WebView settings
        webView.settings.javaScriptEnabled = true // Enable JavaScript if required
        webView.webViewClient = WebViewClient() // Handle navigation in the WebView

        // Load the URL
        val websiteUrl = "https://connexgrow.github.io/safetycheckerlogin/"
        webView.loadUrl(websiteUrl)
    }
}
