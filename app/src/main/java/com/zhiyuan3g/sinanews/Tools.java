package com.zhiyuan3g.sinanews;

import android.app.Activity;
import android.content.Context;

import org.xutils.DbManager;
import org.xutils.x;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * date:2016/9/2
 * author:xuxu(Administrator)
 * function:工具类 用来获取网络请求 和Json 解析
 */
public class Tools {
    public static List<NewsBean> News_transition_NewsBean(News news) {
        //创建SimpleNewsBean集合
        List<NewsBean> newsBeanList = new ArrayList<NewsBean>();

        //获取DataBean，以便于并从中取得数据
        News.DataBean dataBean = news.getData();

        //通过for循环取出数据
        for (int i = 0; i < dataBean.getList().size(); i++) {
            //创建一个SimpleNewsBean对象，以便于存储至集合
            NewsBean newsBean = new NewsBean();

            //设置SimpleNewsBean信息
            newsBean.setNews_id(dataBean.getList().get(i).getId());
            newsBean.setTitle(dataBean.getList().get(i).getTitle());
            newsBean.setLong_title(dataBean.getList().get(i).getLong_title());
            newsBean.setSource(dataBean.getList().get(i).getSource());
            newsBean.setLink(dataBean.getList().get(i).getLink());
            newsBean.setPic(dataBean.getList().get(i).getPic());
            newsBean.setKpic(dataBean.getList().get(i).getKpic());
            newsBean.setBpic(dataBean.getList().get(i).getBpic());
            newsBean.setIntro(dataBean.getList().get(i).getIntro());
            newsBean.setPubDate(dataBean.getList().get(i).getPubDate());
            newsBean.setArticlePubDate(dataBean.getList().get(i).getArticlePubDate());
            newsBean.setComments(dataBean.getList().get(i).getComments());
            newsBean.setFeedShowStyle(dataBean.getList().get(i).getFeedShowStyle());
            newsBean.setCategory(dataBean.getList().get(i).getCategory());
            newsBean.setIs_focus(dataBean.getList().get(i).isIs_focus());
            newsBean.setComment(dataBean.getList().get(i).getComment());

            //把设置好的SimpleNewsBean添加至集合
            newsBeanList.add(newsBean);
        }
        //返回
        return newsBeanList;
    }


    /**
     * 获取数据库管理对象
     */
    public static DbManager getDbManager(Context context) {
        return x.getDb(((App) (((Activity) context)
                .getApplication())).getDaoConfig());
    }

    /**
     * 把毫秒转换时分秒
     */
    public static String getMS_Turn_Date(int millis) {
        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(date);
    }



}
