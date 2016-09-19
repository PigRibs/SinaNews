package com.zhiyuan3g.sinanews;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.google.gson.Gson;

import org.xutils.DbManager;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * date:2016/9/2
 * author:xuxu(Administrator)
 * function:
 */
public class OKHttpTools {
    public static void GetRequest(final Context context, OkHttpClient okHttpClient, String urlPath, final Handler handler) {
        //创建请求类
        final Request request = new Request.Builder().url(urlPath)
                .build();
        //创建任务
        Call call = okHttpClient.newCall(request);
        //显示网址到日志
        Log.i("newsUrl", urlPath);

        //把任务添加到异步执行队列中
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //日志输出
                Log.e("newsEnqueue", "任务执行失败，获取网络数据失败");
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //获取网络JSON字符串
                String newsJsonContent = response.body().string();
                //显示内容长度到日志
                Log.i("newsJsonLength", String.valueOf(response.body().contentLength()));
                //显示获取JSON内容
                Log.i("newsContent", newsJsonContent);
                //创建GSON对象，用于解析
                Gson gson = new Gson();
                //使用GSON解析复杂的JSON数据，并传入实体类
                News news = gson.fromJson(newsJsonContent, News.class);
                //获取XUtils中数据库模块的对象
                DbManager db = Tools.getDbManager(context);
                //把OriginalNewsBean的复杂数据转换为简单易用的数据，并保存至simpleNewsBeans.
                List<NewsBean> NewsBeans = Tools.News_transition_NewsBean(news);
                //先删除数据库
                db.delete(NewsBeans);
                //再保存内容到数据库
                db.save(NewsBeans);
                //创建消息
                Message message = Message.obtain(handler, Constants.INTENT_SUCCESS, NewsBeans);
                //发送
                handler.sendMessage(message);
            }
        });
    }


    public static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(3000, TimeUnit.MINUTES)
            .readTimeout(3000,TimeUnit.MINUTES)
            .writeTimeout(3000,TimeUnit.MINUTES)
            .build();

}
