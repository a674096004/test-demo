package dubbo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: User
 * @Date: 2020/1/16 14:46
 * @Description:
 */
public class XmlServer {

    public static void main(String[] args) {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo-server.xml");
            ctx.start();
            System.out.println("---------dubbo启动成功--------");

            // 保证服务一直开着
            synchronized (XmlServer.class) {
                try {
                    XmlServer.class.wait();
                } catch (Throwable e) {
                }
            }

    }
}
