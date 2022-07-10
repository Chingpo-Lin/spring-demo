package net.xdclass.spring.domain;

public class VideoOrder {

    private int id;

    private String outTradeNo;

    private Video video;

    public VideoOrder() {
        System.out.println("VideoOrder is called");
    }

    public VideoOrder(Video video) {
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Video getVideo() {
        return video;
    }

    public void init() {
        System.out.println("hello video order init");
    }

    public void destroy() {
        System.out.println("hello video order destroy");
    }

    public void setVideo(Video video) {
        System.out.println("hello set video");
        this.video = video;
    }
}
