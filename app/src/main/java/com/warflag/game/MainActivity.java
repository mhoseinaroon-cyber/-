package com.warflag.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.graphics.Color;

public class MainActivity extends Activity {
@Override
public void onCreate(Bundle b) {
super.onCreate(b);

    getWindow().setFlags(1024, 1024);

    WebView w = new WebView(this);
    w.setBackgroundColor(Color.BLACK);

    WebSettings s = w.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(false);
    s.setAllowFileAccess(true);

    w.setOverScrollMode(View.OVER_SCROLL_NEVER);
    w.loadUrl("file:///android_asset/index.html");

    setContentView(w);
}

}
