package net.xdclass.spring.service;

import net.xdclass.spring.config.CustomConfig;
import net.xdclass.spring.dao.VideoDao;
import net.xdclass.spring.domain.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("videoService")
@Service("videoService")
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;

    @Autowired
    private CustomConfig customConfig;

    @Override
    public int save(Video video) {
        System.out.println("save video");
        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("find video by id");
        videoDao.test();
        System.out.println(customConfig.getHost());

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Video();
    }
}
