package com.zhiyuan3g.sinanews;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.xutils.DbManager;
import org.xutils.ex.DbException;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lst_show;
    private List<NewsBean> newsBeanList = null ;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case Constants.INTENT_SUCCESS:
                    newsBeanList = (List<NewsBean>) msg.obj;
                    MyNewsAdapter intentAdapter = new MyNewsAdapter(MainActivity.this, newsBeanList);
                    lst_show.setAdapter(intentAdapter);
                    break;
                case Constants.LOCATION_SUCCESS:
                    newsBeanList = (List<NewsBean>) msg.obj;
                    MyNewsAdapter locationAdapter = new MyNewsAdapter(MainActivity.this, newsBeanList);
                    lst_show.setAdapter(locationAdapter);
                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        lst_show = (ListView) findViewById(R.id.lst_show);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo == null || !networkInfo.isAvailable()) {
            //当前有可用网络
            String Path = "http://api.sina.cn/sinago/list.json?channel=news_toutiao";
            OKHttpTools.GetRequest(MainActivity.this, OKHttpTools.okHttpClient, Path, handler);
        } else {
            //不联网状态
            Toast.makeText(MainActivity.this, "无互联网连接,从本地获取", Toast.LENGTH_SHORT).show();
            //获取数据库对象
            DbManager db = Tools.getDbManager(MainActivity.this);
            try {
                //获取数据库里插到的数据
                List<NewsBean> newsBeanList = db.selector(NewsBean.class).findAll();
                //创建一个消息
                Message message = Message.obtain(handler, Constants.LOCATION_SUCCESS, newsBeanList);
                //发送
                handler.sendMessage(message);
            } catch (DbException e) {
                e.printStackTrace();
            }

        }
        lst_show.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("urlPath", newsBeanList.get(i).getLink());
        //跳转
        startActivity(intent);
    }
}
