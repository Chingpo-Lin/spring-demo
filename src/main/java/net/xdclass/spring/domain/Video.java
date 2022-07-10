package net.xdclass.spring.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Component
//@Scope("prototype")
public class Video {

    private int id;

    private String title;

//    private List<String> chapterList;
//
//    private Map<Integer, String> videoMap;


    public Video() {
//        System.out.println("here Video null constructor");
    }

    public Video(String title) {
        // System.out.println("hello constructor with param");
        this.title = title;
    }

    @PostConstruct
    public void init() {
        System.out.println("init in video is called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy in video is called");
    }

//    public List<String> getChapterList() {
//        return chapterList;
//    }
//
//    public void setChapterList(List<String> chapterList) {
//        this.chapterList = chapterList;
//    }
//
//    public Map<Integer, String> getVideoMap() {
//        return videoMap;
//    }
//
//    public void setVideoMap(Map<Integer, String> videoMap) {
//        this.videoMap = videoMap;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // System.out.println("hello set id");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // System.out.println("hello set title");
        this.title = title;
    }
}
