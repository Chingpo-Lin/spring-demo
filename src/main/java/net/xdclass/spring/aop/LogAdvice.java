package net.xdclass.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
// 切面类，里面可定义切入点通知
@Aspect
public class LogAdvice {

    @Pointcut("execution(* net.xdclass.spring.service.VideoServiceImpl.*(git init..))")
    public void aspect() {

    }

    // qian zhi tong zhi
//    @Before("execution(* net.xdclass.spring.service.VideoServiceImpl.*(..))")
    @Before("aspect()")
    public void beforeLog(JoinPoint joinPoint) {
        System.out.println("log advice before log");
    }

    // hou zhi tong zhi
    @After("aspect()")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("log advice after log");
    }

    @Around("aspect()")
    public void around(JoinPoint joinPoint) {


        Object target = joinPoint.getTarget().getClass().getName();
        System.out.println("who call me: " + target);
        System.out.println("which method call me: " + joinPoint.getSignature());

        Object[] args = joinPoint.getArgs();
        System.out.println("params:" + Arrays.toString(args));

        long start = System.currentTimeMillis();
        System.out.println("around, before around");

        try {
            ((ProceedingJoinPoint) joinPoint).proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("around, after around");
        System.out.println("time=" + (end - start) + " ms");

    }

}
