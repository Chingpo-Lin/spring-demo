package net.xdclass.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            System.out.println("jdk dynamic proxy call " + method.getName() + "begin");
            result = method.invoke(targetObject, args);
            System.out.println("jdk dynamic proxy call " + method.getName() + "after");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
