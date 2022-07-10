package net.xdclass.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("net.xdclass")
@EnableAspectJAutoProxy // kai qi spring dui aspect de support
public class AnnotationAppConfig {
}
