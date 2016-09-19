package com.zhiyuan3g.sinanews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity implements View.OnClickListener {

    private WebView wb_show;
    private ProgressBar pb_webView;
    private Button btn_advance, btn_reload, btn_retreat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        //        对控件进行一个初始化.
        initView();
        //获得listView穿过来的网址
        String trim =getIntent().getStringExtra("urlPath").trim() ;

        Log.d("WebViewActivity", trim);
        //VebView显示网页
        wb_show.loadUrl(trim);

    }

    private void initView() {
        btn_advance = (Button) findViewById(R.id.btn_advance);
        btn_reload = (Button) findViewById(R.id.btn_reload);
        btn_retreat = (Button) findViewById(R.id.btn_retreat);
        btn_advance.setOnClickListener(this);
        btn_reload.setOnClickListener(this);
        btn_retreat.setOnClickListener(this);
        wb_show = (WebView) findViewById(R.id.wb_show);
        pb_webView = (ProgressBar) findViewById(R.id.pb_webView);
        /**
         * 对控件进行一个初始化.
         */
        //        使用webView对象,进行的一些初始化设置
        initWebView();

        //        使用webViewSettings对webVIew进行一系列初始化的设置
        initWebViewSettings();



    }

    /**
     * 使用webView对象,进行的一些初始化设置
     */
    private void initWebView() {
        // setWebViewClient 此方法的作用是,当在webView进点击时,不跳转到游览器的设置(也就是不打开新的Activity),而是在本app里进行操作
        wb_show.setWebViewClient(new WebViewClient() {
            /**
             * 给WebView加一个事件监听对象（WebViewClient)并重写shouldOverrideUrlLoading，
             * 可以对网页中超链接按钮的响应
             * 当按下某个连接时WebViewClient会调用这个方法，并传递参数：当前响应的的url地址
             */
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        // requestFocus 触摸焦点起作用（如果不设置，则在点击网页文本输入框时，不能弹出软键盘及不响应其他的一些事件
        wb_show.requestFocus();


        // setWebChromeClient 该监听事件是指UI(界面)发送改变时进行各监听.  onProgressChanged
        wb_show.setWebChromeClient(new WebChromeClient(){

            @Override
            //     在WebView开始加载网页时，显示进度框；加载完毕时，隐藏进度框
            public void onProgressChanged(WebView view, int newProgress) {
                // 进度条我们在布局文件里设置的是隐藏,在这里我们要让他显示出来
                pb_webView.setVisibility(View.VISIBLE);
                //加载进度
                pb_webView.setProgress(newProgress);
                if (newProgress==100){
                    //   当进度条加载到一百时,我们要把他进行隐藏
                    pb_webView.setVisibility(View.GONE);
                }
                super.onProgressChanged(view, newProgress);
            }
            //通过title的参数,可以获取到访问网页的头.
            @Override
            public void onReceivedTitle(WebView view, String title) {
                Toast.makeText(WebActivity.this, "加载"+title+"中", Toast.LENGTH_SHORT).show();
                super.onReceivedTitle(view, title);
            }
        });
    }

    /**
     * 对网页控件进行一系列的初始化设置
     */
    private void initWebViewSettings() {
        //      得到一个webView的设置对象,WebSettings.
        WebSettings webSet = wb_show.getSettings();
//        webSet.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        // setJavaScriptEnabled  使webView可以支持Javascript:
        webSet.setJavaScriptEnabled(true);
        // setSupportZoom 使webView允许网页缩放,记住用这方法前,要有让webView支持Javascript的设定.否则会不起作用
        webSet.setSupportZoom(true);
        //  setBlockNetworkImage  是webView只加载文字,而不加载图片,为用户省流量.
//        webSet.setBlockNetworkImage(true);
    }


    //  通过点击事件,对网址加载,
//    public void load() {
//
//        if (TextUtils.isEmpty(trim)) {    //进行非空的判断.
//            Toast.makeText(WebViewActivity.this, "不能输入为空", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        //加载用户输入的网址,loadUrl()
//        wb_show.loadUrl("http://"+trim);
//    }




    //  通过点击事件,对网页进行后退操作
    public void advance(){
        //进行一个状态的判断,看是否可以前进,canGoForward
        if (wb_show.canGoForward()){
            //可以前进,就进行前进操作,.goForward();
            wb_show.goForward();
        }

    }



    //  通过点击事件,对网页进行后退操作
    public void retreat(){
        //进行一个状态的判断,看是否可以后退,canGoBack
        if (wb_show.canGoBack()){
            //可以前进,就进行后退操作,goBack();
            wb_show.goBack();
        }
    }


    //  通过点击事件,对网页进行刷新操作
    public void reload(){
        wb_show.reload();   //对当前网页刷新,reload();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_advance :
                advance();
                break;
            case R.id.btn_reload  :
                reload();
                break;
            case R.id.btn_retreat  :
                retreat();
                break;
            default:
                break;
        }
    }
}