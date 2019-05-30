package com.example.webapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    //private static String DIRECCION = "https://developer.android.com/index.html";
    private static String DIRECCION = "https://medium.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web_mail = (WebView)findViewById(R.id.web_view);
        web_mail.setWebViewClient(new MyWebViewClient());
        web_mail.loadUrl(DIRECCION);



    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }



    /**
    private class MyWebViewClient extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
    **/

/**

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView web_mail = (WebView)findViewById(R.id.web_view);

        if ((keyCode == KeyEvent.KEYCODE_BACK) && web_mail.canGoBack()) {
            web_mail.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
    **/

    public void pasar(View view){
            Intent miIntent= new Intent(MainActivity.this, Noticias.class);
            startActivity(miIntent);
    }
}
