package com.com.gaolei.bean;

/**
 * Created by Administrator on 16-9-27.
 */
public class Selection4 {

    /**
     * id : 1471499425945
     * ui : {"layout":"732,348,0,0","bg":"#42afb2,#42afb2,1","lcolor":"#00000000","title":"","desc":"","style":1,"radii":"0,0,0,0","image":"http://img.cdn.molitv.cn/fresh/home/20160923_181957.jpg","icon":"","angle":"","acolor":""}
     * obj : {"fid":"f87398","name":"下午茶","image":"http://img.cdn.molitv.cn/fresh/feeds/87398_1466744358385.jpg","act":"2","type":102}
     * cd : {}
     */

    private long id;
    /**
     * layout : 732,348,0,0
     * bg : #42afb2,#42afb2,1
     * lcolor : #00000000
     * title :
     * desc :
     * style : 1
     * radii : 0,0,0,0
     * image : http://img.cdn.molitv.cn/fresh/home/20160923_181957.jpg
     * icon :
     * angle :
     * acolor :
     */

    private UiBean ui;
    /**
     * fid : f87398
     * name : 下午茶
     * image : http://img.cdn.molitv.cn/fresh/feeds/87398_1466744358385.jpg
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
        private String fid;
        private String name;
        private String image;
        private String act;
        private int type;

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getAct() {
            return act;
        }

        public void setAct(String act) {
            this.act = act;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
