package com.zhiyuan3g.sinanews;

import android.app.Application;
import android.content.pm.PackageManager;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

/**
 * date:2016/9/2
 * author:xuxu(Administrator)
 * function:
 */
public class App extends Application {


    private static final String NEWS = "create table news_data(" +
            "id integer primary key autoincrement," +
            "news_id integer(15)," +
            "title VarChar(50)," +
            "long_title VarChar(100)," +
            "source VarChar(10)," +
            "link Text," +
            "pic Text," +
            "kpic Text," +
            "bpic Text," +
            "intro Text," +
            "pubDate long(30)," +
            "articlePubDate long(30)," +
            "comments Text," +
            "feedShowStyle VarChar(15)," +
            "category VarChar(15)," +
            "is_focus boolean," +
            "comment integer(10)" +
            ")";

    private DbManager.DaoConfig daoConfig;

    public DbManager.DaoConfig getDaoConfig() {
        return daoConfig;
    }

    public final String appName() {
        //创建一个PackageManager类
        PackageManager pm = this.getPackageManager();
        //获取项目名
        String appName = this.getApplicationInfo().loadLabel(pm).toString();
        //返回
        return appName;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        //初始化
        x.Ext.init(this);
        //开启Debug调试
        x.Ext.setDebug(true);
        daoConfig = new DbManager.DaoConfig()
                .setDbName(appName())
                .setDbVersion(1)
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
                        try {
                            db.execNonQuery(NEWS);
                        } catch (DbException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}