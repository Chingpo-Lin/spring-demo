package net.xdclass.spring.proxy;

public class ProxyTest {

    public static void main(String [] args) {
//        PayService payService = new PayServiceImpl();
//        payService.callback("xncinqo222");

//        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
//        payService.save(234,4232);

        //JDK dynamic proxy
//        JDKProxy jdkProxy = new JDKProxy();
//
//        // get proxy instance
//        PayService payServiceProxy = (PayService) jdkProxy.newProxyInstance(new PayServiceImpl());
//        payServiceProxy.callback("sdqeqerqew");
//        payServiceProxy.save(23,54254);

        // CGlib动态代理
        CglibProxy cglibProxy = new CglibProxy();
        PayService payService = (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());
        payService.save(23, 9793);
        payService.callback("fejwejirqo");
    }
}
