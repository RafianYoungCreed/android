package assalaam.test2.com.rafian;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        webView = (WebView) findViewById(R.id.webview);webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webView.loadUrl("https://www.smkassalaambandung.sch.id/");}

        @Override public boolean onKeyDown(int keyCode, KeyEvent event) {

            if(keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
//untuk tombol back aplikasi tidak akan keluar tetapi kembali ke web sebelumnya
                webView.goBack();
                return true;

            } return super.onKeyDown(keyCode, event);
        }

        /**
         * Method untuk mengtutup aplikasi
         */
    private void finishApp() {
        finish();
        moveTaskToBack(true);
    }
}