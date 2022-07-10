package net.xdclass.spring.domain;

public class Video2 {

    private int id;

    private String title;

    private String summary;

    public Video2() {
        // System.out.println("here Video2 null constructor");
    }

    public Video2(String title) {
        // System.out.println("hello constructor2 with param");
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // System.out.println("hello set id2");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // System.out.println("hello set title2");
        this.title = title;
    }
}
