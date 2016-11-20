package com.com.gaolei.bean;

import java.util.List;

/**
 * Created by Administrator on 16-9-27.
 */
public class DataBean2  {


    /**
     * id : 1473404606391
     * ui : {"layout":"360,228,744,480","bg":"#42afb2,#42afb2,1","lcolor":"#00000000","title":"十二星座谁最怂","desc":"","style":3,"radii":"0,0,0,0","image":"http://img.cdn.molitv.cn/fresh/home/20160927_183642.jpg","icon":"","angle":"","acolor":""}
     * obj : {"fid":"f192901","name":"星座不求人","firstvideo":{"mid":13924812,"title":"爆笑视频:《十二星座的谁最怂》，说的就是你，别不承认！","desc":"","pageUrl":"http://v.youku.com/v_show/id_XMTczNDA4NDg2NA==.html","channel":0,"imageUrl":"http://r4.ykimg.com/0541010157E49E34641DA410DC6D5C81","duration":0,"vd":0,"deleted":false,"status":0,"timeCreated":"2016-09-24 19:02:24","timeModified":"0001-01-01 00:00:00","dataSource":"Unknow","pubTime":"2016-09-24 19:02:24","updateTime":"09-24","playCount":12,"owner":{},"tags":[],"category":""},"image":"http://r4.ykimg.com/0541010157BE72D7641DA410DC405395","act":"2","type":102}
     * cd : {}
     */

    private long id;
    /**
     * layout : 360,228,744,480
     * bg : #42afb2,#42afb2,1
     * lcolor : #00000000
     * title : 十二星座谁最怂
     * desc :
     * style : 3
     * radii : 0,0,0,0
     * image : http://img.cdn.molitv.cn/fresh/home/20160927_183642.jpg
     * icon :
     * angle :
     * acolor :
     */

    private UiBean ui;
    /**
     * fid : f192901
     * name : 星座不求人
     * firstvideo : {"mid":13924812,"title":"爆笑视频:《十二星座的谁最怂》，说的就是你，别不承认！","desc":"","pageUrl":"http://v.youku.com/v_show/id_XMTczNDA4NDg2NA==.html","channel":0,"imageUrl":"http://r4.ykimg.com/0541010157E49E34641DA410DC6D5C81","duration":0,"vd":0,"deleted":false,"status":0,"timeCreated":"2016-09-24 19:02:24","timeModified":"0001-01-01 00:00:00","dataSource":"Unknow","pubTime":"2016-09-24 19:02:24","updateTime":"09-24","playCount":12,"owner":{},"tags":[],"category":""}
     * image : http://r4.ykimg.com/0541010157BE72D7641DA410DC405395
     * act : 2
     * type : 102
     */

    private ObjBean obj;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UiBean getUi() {
        return ui;
    }

    public void setUi(UiBean ui) {
        this.ui = ui;
    }

    public ObjBean getObj() {
        return obj;
    }

    public void setObj(ObjBean obj) {
        this.obj = obj;
    }

    public static class UiBean {
        private String layout;
        private String bg;
        private String lcolor;
        private String title;
        private String desc;
        private int style;
        private String radii;
        private String image;
        private String icon;
        private String angle;
        private String acolor;

        public String getLayout() {
            return layout;
        }

        public void setLayout(String layout) {
            this.layout = layout;
        }

        public String getBg() {
            return bg;
        }

        public void setBg(String bg) {
            this.bg = bg;
        }

        public String getLcolor() {
            return lcolor;
        }

        public void setLcolor(String lcolor) {
            this.lcolor = lcolor;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getStyle() {
            return style;
        }

        public void setStyle(int style) {
            this.style = style;
        }

        public String getRadii() {
            return radii;
        }

        public void setRadii(String radii) {
            this.radii = radii;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getAngle() {
            return angle;
        }

        public void setAngle(String angle) {
            this.angle = angle;
        }

        public String getAcolor() {
            return acolor;
        }

        public void setAcolor(String acolor) {
            this.acolor = acolor;
        }
    }

    public static class ObjBean {
        /**
         * mid : 13924812
         * title : 爆笑视频:《十二星座的谁最怂》，说的就是你，别不承认！
         * desc :
         * pageUrl : http://v.youku.com/v_show/id_XMTczNDA4NDg2NA==.html
         * channel : 0
         * imageUrl : http://r4.ykimg.com/0541010157E49E34641DA410DC6D5C81
         * duration : 0
         * vd : 0
         * deleted : false
         * status : 0
         * timeCreated : 2016-09-24 19:02:24
         * timeModified : 0001-01-01 00:00:00
         * dataSource : Unknow
         * pubTime : 2016-09-24 19:02:24
         * updateTime : 09-24
         * playCount : 12
         * owner : {}
         * tags : []
         * category :
         */

        private FirstvideoBean firstvideo;

        public FirstvideoBean getFirstvideo() {
            return firstvideo;
        }

        public void setFirstvideo(FirstvideoBean firstvideo) {
            this.firstvideo = firstvideo;
        }

        public static class FirstvideoBean {
            private int mid;
            private String title;
            private String desc;
            private String pageUrl;
            private int channel;
            private String imageUrl;
            private int duration;
            private int vd;
            private boolean deleted;
            private int status;
            private String timeCreated;
            private String timeModified;
            private String dataSource;
            private String pubTime;
            private String updateTime;
            private int playCount;
            private OwnerBean owner;
            private String category;
            private List<?> tags;

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPageUrl() {
                return pageUrl;
            }

            public void setPageUrl(String pageUrl) {
                this.pageUrl = pageUrl;
            }

            public int getChannel() {
                return channel;
            }

            public void setChannel(int channel) {
                this.channel = channel;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getVd() {
                return vd;
            }

            public void setVd(int vd) {
                this.vd = vd;
            }

            public boolean isDeleted() {
                return deleted;
            }

            public void setDeleted(boolean deleted) {
                this.deleted = deleted;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTimeCreated() {
                return timeCreated;
            }

            public void setTimeCreated(String timeCreated) {
                this.timeCreated = timeCreated;
            }

            public String getTimeModified() {
                return timeModified;
            }

            public void setTimeModified(String timeModified) {
                this.timeModified = timeModified;
            }

            public String getDataSource() {
                return dataSource;
            }

            public void setDataSource(String dataSource) {
                this.dataSource = dataSource;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public int getPlayCount() {
                return playCount;
            }

            public void setPlayCount(int playCount) {
                this.playCount = playCount;
            }

            public OwnerBean getOwner() {
                return owner;
            }

            public void setOwner(OwnerBean owner) {
                this.owner = owner;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }

            public static class OwnerBean {
            }
        }
    }
}
