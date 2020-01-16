package dubbo.xml;

import entity.OrderEntiry;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

/**
 * @auther: User
 * @Date: 2020/1/16 14:52
 * @Description:
 */
public class XmlClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-client.xml");
        ctx.start();
        System.out.println("---------dubbo启动成功--------");
        OrderService orderService = (OrderService) ctx.getBean("orderService"); // get remote service proxy

        OrderEntiry entiry = orderService.getDetail("1");
        System.out.println("echo result: " + entiry.getMoney());
    }
}
