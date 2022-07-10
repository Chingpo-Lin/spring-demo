package net.xdclass.spring.config;

import net.xdclass.spring.domain.VideoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean("xxx")
    // 如果不取名就是方法名开头小写
    // 表明这个bean交给spring进行管理
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public VideoOrder videoOrder() {
        return new VideoOrder();
    }
}
