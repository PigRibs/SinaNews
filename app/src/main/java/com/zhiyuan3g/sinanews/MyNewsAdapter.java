package com.zhiyuan3g.sinanews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * date:2016/9/2
 * author:xuxu(Administrator)
 * function:
 */
public class MyNewsAdapter extends BaseAdapter {
    private Context context;
    private List<NewsBean> newsBeanList;

    public MyNewsAdapter(Context context, List<NewsBean> newsBeanList) {
        this.context = context;
        this.newsBeanList = newsBeanList;
    }

    @Override
    public int getCount() {
        return newsBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_show_item, null);

            holder.SimpleDraweeView = (SimpleDraweeView) convertView.findViewById(R.id.img_show);
            holder.tv_source = (TextView) convertView.findViewById(R.id.tv_source);
            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tv_data = (TextView) convertView.findViewById(R.id.tv_date);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        NewsBean newsBean = newsBeanList.get(position);
        holder.SimpleDraweeView.setImageURI(newsBean.getPic());
        holder.tv_title.setText(newsBean.getTitle());
        holder.tv_source.setText(newsBean.getSource());
        holder.tv_data.setText(Tools.getMS_Turn_Date(newsBean.getPubDate()));
        return convertView;
    }

    private class Holder {
        private SimpleDraweeView SimpleDraweeView;
        private TextView tv_title;
        private TextView tv_source;
        private TextView tv_data;
    }
}
