package net.xdclass.spring;


import net.xdclass.spring.aop.AnnotationAppConfig;
import net.xdclass.spring.domain.Video;
import net.xdclass.spring.domain.VideoOrder;
import net.xdclass.spring.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
//        // 扫描指定的包及子包
//        context.scan("net.xdclass");
//
//        // 完成初始化操作核心方法
//        context.refresh();
        VideoService videoService = (VideoService) context.getBean("videoService");
        videoService.findById(2);
    }

}
























//
//import net.xdclass.spring.domain.Video;
//import net.xdclass.spring.domain.Video2;
//import net.xdclass.spring.domain.VideoOrder;
//import net.xdclass.spring.service.VideoService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class App {
//
//    public static void main(String[] args) {
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
////        testInjectCollection(context);
////        testInject(context);
////        testInitAndDestroy(context);
////        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
////        System.out.println(videoOrder.getOutTradeNo());
////        System.out.println(videoOrder.getVideo().getTitle());
//        testAop(context);
//
//
////        ((ClassPathXmlApplicationContext) context).registerShutdownHook(); // 毁掉函数
//    }
//
//    private static void testAop(ApplicationContext context) {
//        VideoService videoService = (VideoService) context.getBean("videoService");
//        videoService.save(new Video());
//        videoService.findById(33);
//    }
//
//    private static void testExtend(ApplicationContext context) {
//        Video2 video2 = (Video2) context.getBean("video2");
//        System.out.println(video2.getSummary());
//        System.out.println(video2.getTitle());
//        System.out.println(video2.getId());
//    }
//
//    private static void testInjectCollection(ApplicationContext context) {
//        Video video = (Video) context.getBean("video");
////        System.out.println(video.getChapterList());
////        System.out.println(video.getVideoMap().values());
//    }
//
//    // 注入测试
//    private static void testInject(ApplicationContext context) {
////        Video video = (Video) context.getBean("video");
////        System.out.println(video.getTitle());
//
//        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
//        System.out.println(videoOrder.getVideo().getTitle());
//    }
//
//    private static void testScope(ApplicationContext context) {
//        Video video1 = (Video) context.getBean("video");
//        Video video2 = (Video) context.getBean("video");
//
//        System.out.println(video1 == video2);
//    }
//
//    private static void testInitAndDestroy(ApplicationContext context) {
//        Video video = (Video) context.getBean("video");
//
//        System.out.println(video.getTitle());
//    }
//
//}
