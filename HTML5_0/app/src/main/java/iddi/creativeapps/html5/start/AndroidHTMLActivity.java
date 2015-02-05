package iddi.creativeapps.html5.start;

import android.app.Activity;
        import android.app.AlertDialog;
        import android.content.Context;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebView;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

import html5.example.com.start.R;

/**
 * main activity, will create a wrapper for HTML files
 */
public class AndroidHTMLActivity extends Activity {

    WebView myBrowser;
    EditText Msg;
    Button btnSendMsg;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myBrowser = (WebView)findViewById(R.id.mybrowser);
        myBrowser.getSettings().setJavaScriptEnabled(true);
        myBrowser.loadUrl("file:///android_asset/www/mypage.html");
    }
}