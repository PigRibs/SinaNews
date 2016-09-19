package com.zhiyuan3g.sinanews;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * date:2016/9/2
 * author:xuxu(Administrator)
 * function:
 */
@Table(name = "news_data")
public class NewsBean {

    /**
     * 数据库id
     */
    @Column(name = "id", isId = true)
    private int id;
    /**
     * 新闻id
     */
    @Column(name = "news_id")
    private String news_id;
    /**
     * 新闻标题
     */
    @Column(name = "title")
    private String title;
    /**
     * 新闻长标题
     */
    @Column(name = "long_title")
    private String long_title;
    /**
     * 新闻来源
     */
    @Column(name = "source")
    private String source;
    /**
     * 新闻链接
     */
    @Column(name = "link")
    private String link;
    /**
     * 新闻图片链接
     */
    @Column(name = "pic")
    private String pic;
    /**
     * K 新闻图片链接
     */
    @Column(name = "kpic")
    private String kpic;
    /**
     * B 新闻图片链接
     */
    @Column(name = "bpic")
    private String bpic;
    /**
     * 新闻简介
     */
    @Column(name = "intro")
    private String intro;
    /**
     * 新闻出版时间
     */
    @Column(name = "pubDate")
    private int pubDate;
    /**
     * 新闻发布时间(新闻内容发布时间)
     */
    @Column(name = "articlePubDate")
    private int articlePubDate;
    /**
     * 该新闻的最新评论
     */
    @Column(name = "comments")
    private String comments;
    /**
     * 注入显示风格
     */
    @Column(name = "feedShowStyle")
    private String feedShowStyle;
    /**
     * 新闻分类
     */
    @Column(name = "category")
    private String category;
    /**
     * 是否属于焦点新闻(头条新闻，重大新闻)
     */
    @Column(name = "is_focus")
    private boolean is_focus;
    /**
     * 该新闻评论数
     */
    @Column(name = "comment")
    private int comment;

    public NewsBean() {
    }

    public NewsBean(int id, String news_id, String title, String long_title, String source, String link, String pic, String kpic, String bpic, String intro, int pubDate, int articlePubDate, String comments, String feedShowStyle, String category, boolean is_focus, int comment) {
        this.id = id;
        this.news_id = news_id;
        this.title = title;
        this.long_title = long_title;
        this.source = source;
        this.link = link;
        this.pic = pic;
        this.kpic = kpic;
        this.bpic = bpic;
        this.intro = intro;
        this.pubDate = pubDate;
        this.articlePubDate = articlePubDate;
        this.comments = comments;
        this.feedShowStyle = feedShowStyle;
        this.category = category;
        this.is_focus = is_focus;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNews_id() {
        return news_id;
    }

    public void setNews_id(String news_id) {
        this.news_id = news_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLong_title() {
        return long_title;
    }

    public void setLong_title(String long_title) {
        this.long_title = long_title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getKpic() {
        return kpic;
    }

    public void setKpic(String kpic) {
        this.kpic = kpic;
    }

    public String getBpic() {
        return bpic;
    }

    public void setBpic(String bpic) {
        this.bpic = bpic;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

    public int getArticlePubDate() {
        return articlePubDate;
    }

    public void setArticlePubDate(int articlePubDate) {
        this.articlePubDate = articlePubDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFeedShowStyle() {
        return feedShowStyle;
    }

    public void setFeedShowStyle(String feedShowStyle) {
        this.feedShowStyle = feedShowStyle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean is_focus() {
        return is_focus;
    }

    public void setIs_focus(boolean is_focus) {
        this.is_focus = is_focus;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }
}