package ru.sikuda.mobile.start32

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class BrowserActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.browser)
        val webView = findViewById<View>(R.id.webView) as WebView
        webView.webViewClient = WebViewClient()
        val data = intent.data
        webView.loadUrl(data.toString())
    }
}