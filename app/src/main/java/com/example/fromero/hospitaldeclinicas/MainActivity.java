package com.example.fromero.hospitaldeclinicas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mWebView = (WebView) findViewById(R.id.activity_main_webview);
// Se activa javascript
        //  WebSettings webSettings = mWebView.getSettings();
        // webSettings.setjavascriptEnabled(true);
        mWebView.getSettings().setJavaScriptEnabled(true);

// Forzar el webview para que abra los enlaces internos dentro de la la APP
        mWebView.setWebViewClient(new WebViewClient());
        // Url
        //mWebView.loadUrl("http://157.92.188.8/personal/");
        mWebView.loadUrl("http://157.92.188.8/");
// Forzar el webview para que abra los enlaces externos en el navegador
        mWebView.setWebViewClient(new MyAppWebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            // mWebView.goBack();
         //   mWebView.clearHistory();
            //mWebView.loadUrl("http://157.92.188.8/personal/home.php");
           //mWebView.loadUrl("http://157.92.188.8/informatica/tecnico.php");
       // }
      //  else
       // {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Seguro que desea salir?")
                    .setCancelable(false)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        }

    }
}
