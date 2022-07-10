package net.xdclass.spring.proxy;

public class PayServiceImpl implements PayService {

    @Override
    public String callback(String outTradeNo) {
        System.out.println("target callback payserviceimpl");
        return outTradeNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("target save payserviceimpl");
        return 0;
    }
}
