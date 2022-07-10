package net.xdclass.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("videoDao")
public class VideoDao {

    public void test() {
        System.out.println("video dao test");
    }
}
