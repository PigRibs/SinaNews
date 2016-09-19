package com.zhiyuan3g.sinanews;

import java.util.List;

/**
 * date:2016/9/2
 * author:xuxu(Administrator)
 * function:
 */
public class News {

    /**
     * status : 0
     * data : {"is_intro":"0","list":[{"id":"2841-101848-hdpic","title":"决堤23天 安徽村庄仍如孤岛","long_title":"决堤23天 安徽村庄仍如孤岛","source":"CFP","link":"http://photo.sina.cn/album_1_2841_101848.htm?ch=1&fromsinago=1","pic":"http://r3.sinaimg.cn/10230/2016/0729/0a/8/68620871/auto.jpg","kpic":"http://l.sinaimg.cn/n/news/20160729/Cmz_-fxupmws1270709.jpg/original.jpg","bpic":"","intro":"2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/","pubDate":1469748524,"articlePubDate":1469757013,"comments":"slidenews-album-2841-101848_1_gn__2841-101848-hdpic","pics":{"total":10,"list":[{"pic":"http://r3.sinaimg.cn/10230/2016/0729/c8/e/40622572/auto.jpg","alt":"2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/视觉中国","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717189_292827.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/44/c/51621028/auto.jpg","alt":"26日，东至县张溪镇东湖村被淹区域水位下降，部分村民回到家中。武警水电部队来到当地，为当地加固堤坝，封堵决口。图为因圩口漫破，被洪水冲击破损的房屋。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717194_214667.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/e6/4/69616144/auto.jpg","alt":"安徽省池州市东至县张溪镇东湖村，左边为黄湓河，右边为破圩后的东湖村。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717187_764748.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/85/9/62621712/auto.jpg","alt":"村民用门板搭成小船在村内行走。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717188_571207.jpg/original.jpg"}]},"feedShowStyle":"common","category":"hdpic","is_focus":true,"comment":215,"comment_count_info":{"qreply":1309,"total":1603,"show":215,"comment_status":0,"praise":15,"dispraise":22}}]}
     */

    private int status;
    /**
     * is_intro : 0
     * list : [{"id":"2841-101848-hdpic","title":"决堤23天 安徽村庄仍如孤岛","long_title":"决堤23天 安徽村庄仍如孤岛","source":"CFP","link":"http://photo.sina.cn/album_1_2841_101848.htm?ch=1&fromsinago=1","pic":"http://r3.sinaimg.cn/10230/2016/0729/0a/8/68620871/auto.jpg","kpic":"http://l.sinaimg.cn/n/news/20160729/Cmz_-fxupmws1270709.jpg/original.jpg","bpic":"","intro":"2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/","pubDate":1469748524,"articlePubDate":1469757013,"comments":"slidenews-album-2841-101848_1_gn__2841-101848-hdpic","pics":{"total":10,"list":[{"pic":"http://r3.sinaimg.cn/10230/2016/0729/c8/e/40622572/auto.jpg","alt":"2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/视觉中国","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717189_292827.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/44/c/51621028/auto.jpg","alt":"26日，东至县张溪镇东湖村被淹区域水位下降，部分村民回到家中。武警水电部队来到当地，为当地加固堤坝，封堵决口。图为因圩口漫破，被洪水冲击破损的房屋。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717194_214667.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/e6/4/69616144/auto.jpg","alt":"安徽省池州市东至县张溪镇东湖村，左边为黄湓河，右边为破圩后的东湖村。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717187_764748.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/85/9/62621712/auto.jpg","alt":"村民用门板搭成小船在村内行走。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717188_571207.jpg/original.jpg"}]},"feedShowStyle":"common","category":"hdpic","is_focus":true,"comment":215,"comment_count_info":{"qreply":1309,"total":1603,"show":215,"comment_status":0,"praise":15,"dispraise":22}}]
     */

    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String is_intro;
        /**
         * id : 2841-101848-hdpic
         * title : 决堤23天 安徽村庄仍如孤岛
         * long_title : 决堤23天 安徽村庄仍如孤岛
         * source : CFP
         * link : http://photo.sina.cn/album_1_2841_101848.htm?ch=1&fromsinago=1
         * pic : http://r3.sinaimg.cn/10230/2016/0729/0a/8/68620871/auto.jpg
         * kpic : http://l.sinaimg.cn/n/news/20160729/Cmz_-fxupmws1270709.jpg/original.jpg
         * bpic :
         * intro : 2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/
         * pubDate : 1469748524
         * articlePubDate : 1469757013
         * comments : slidenews-album-2841-101848_1_gn__2841-101848-hdpic
         * pics : {"total":10,"list":[{"pic":"http://r3.sinaimg.cn/10230/2016/0729/c8/e/40622572/auto.jpg","alt":"2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/视觉中国","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717189_292827.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/44/c/51621028/auto.jpg","alt":"26日，东至县张溪镇东湖村被淹区域水位下降，部分村民回到家中。武警水电部队来到当地，为当地加固堤坝，封堵决口。图为因圩口漫破，被洪水冲击破损的房屋。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717194_214667.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/e6/4/69616144/auto.jpg","alt":"安徽省池州市东至县张溪镇东湖村，左边为黄湓河，右边为破圩后的东湖村。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717187_764748.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/85/9/62621712/auto.jpg","alt":"村民用门板搭成小船在村内行走。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717188_571207.jpg/original.jpg"}]}
         * feedShowStyle : common
         * category : hdpic
         * is_focus : true
         * comment : 215
         * comment_count_info : {"qreply":1309,"total":1603,"show":215,"comment_status":0,"praise":15,"dispraise":22}
         */

        private List<ListBean> list;

        public String getIs_intro() {
            return is_intro;
        }

        public void setIs_intro(String is_intro) {
            this.is_intro = is_intro;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String id;
            private String title;
            private String long_title;
            private String source;
            private String link;
            private String pic;
            private String kpic;
            private String bpic;
            private String intro;
            private int pubDate;
            private int articlePubDate;
            private String comments;
            /**
             * total : 10
             * list : [{"pic":"http://r3.sinaimg.cn/10230/2016/0729/c8/e/40622572/auto.jpg","alt":"2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/视觉中国","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717189_292827.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/44/c/51621028/auto.jpg","alt":"26日，东至县张溪镇东湖村被淹区域水位下降，部分村民回到家中。武警水电部队来到当地，为当地加固堤坝，封堵决口。图为因圩口漫破，被洪水冲击破损的房屋。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717194_214667.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/e6/4/69616144/auto.jpg","alt":"安徽省池州市东至县张溪镇东湖村，左边为黄湓河，右边为破圩后的东湖村。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717187_764748.jpg/original.jpg"},{"pic":"http://r3.sinaimg.cn/10230/2016/0729/85/9/62621712/auto.jpg","alt":"村民用门板搭成小船在村内行走。","kpic":"http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717188_571207.jpg/original.jpg"}]
             */

            private PicsBean pics;
            private String feedShowStyle;
            private String category;
            private boolean is_focus;
            private int comment;
            /**
             * qreply : 1309
             * total : 1603
             * show : 215
             * comment_status : 0
             * praise : 15
             * dispraise : 22
             */

            private CommentCountInfoBean comment_count_info;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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

            public PicsBean getPics() {
                return pics;
            }

            public void setPics(PicsBean pics) {
                this.pics = pics;
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

            public boolean isIs_focus() {
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

            public CommentCountInfoBean getComment_count_info() {
                return comment_count_info;
            }

            public void setComment_count_info(CommentCountInfoBean comment_count_info) {
                this.comment_count_info = comment_count_info;
            }

            public static class PicsBean {
                private int total;
                /**
                 * pic : http://r3.sinaimg.cn/10230/2016/0729/c8/e/40622572/auto.jpg
                 * alt : 2016年7月26日，安徽省池州市东至县张溪镇东湖村3日因东湖圩圩堤漫破，全村800余户及农田被淹在水中，整村村民转移到安置点。摄影：弯莞/视觉中国
                 * kpic : http://l.sinaimg.cn/www/dy/slidenews/1_img/2016_30/2841_717189_292827.jpg/original.jpg
                 */

                private List<SonListBean> list;

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public List<SonListBean> getList() {
                    return list;
                }

                public void setList(List<SonListBean> list) {
                    this.list = list;
                }

                public static class SonListBean {
                    private String pic;
                    private String alt;
                    private String kpic;

                    public String getPic() {
                        return pic;
                    }

                    public void setPic(String pic) {
                        this.pic = pic;
                    }

                    public String getAlt() {
                        return alt;
                    }

                    public void setAlt(String alt) {
                        this.alt = alt;
                    }

                    public String getKpic() {
                        return kpic;
                    }

                    public void setKpic(String kpic) {
                        this.kpic = kpic;
                    }
                }
            }

            public static class CommentCountInfoBean {
                private int qreply;
                private int total;
                private int show;
                private int comment_status;
                private int praise;
                private int dispraise;

                public int getQreply() {
                    return qreply;
                }

                public void setQreply(int qreply) {
                    this.qreply = qreply;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getShow() {
                    return show;
                }

                public void setShow(int show) {
                    this.show = show;
                }

                public int getComment_status() {
                    return comment_status;
                }

                public void setComment_status(int comment_status) {
                    this.comment_status = comment_status;
                }

                public int getPraise() {
                    return praise;
                }

                public void setPraise(int praise) {
                    this.praise = praise;
                }

                public int getDispraise() {
                    return dispraise;
                }

                public void setDispraise(int dispraise) {
                    this.dispraise = dispraise;
                }
            }
        }
    }
}
