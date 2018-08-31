package com.example.fromero.hospitaldeclinicas;

/**
 * Created by fromero on 12/07/2017.
 */
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // Url base de la APP (al salir de esta url, abre el navegador) poner como se muestra, sin https://
        if(Uri.parse(url).getHost().endsWith("157.92.188.8")) {
            return false;
    }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }

    @Override
    public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
        handler.proceed();
    }


}

