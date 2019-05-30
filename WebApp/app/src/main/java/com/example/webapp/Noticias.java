package com.example.webapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Noticias extends AppCompatActivity {
    private static String DIRECCION = "http://www.upt.edu.pe/upt/web/home/not_detalle/100000000/97640686";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        WebView web_mail = (WebView)findViewById(R.id.web_view2);
        web_mail.setWebViewClient(new MyWebViewClient());
        web_mail.loadUrl(DIRECCION);



    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
}
