package wpy.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wpy.bean.LookUptest;
import wpy.bean.Student1;

/**
 * @auther: User
 * @Date: 2020/1/11 22:31
 * @Description:
 */
public class MyTest {

    @Test
    public void testAnnotation() {
        // 注解启动
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("wpy.bean");
        Student1 student = (Student1) annotationConfigApplicationContext.getBean("student1");
        System.out.println(student.getName());
    }

    @Test
    public void testXml() {
        // xml启动
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
       // Student stu = (Student) classPathXmlApplicationContext.getBean("student");
       // System.out.println(stu.getName());
        // 容器关闭才会调用destory方法
       // classPathXmlApplicationContext.registerShutdownHook();
    }
    @Test
    public void testOther() {
        // 基本用不到
//        new FileSystemXmlApplicationContext("");
        // springboot启动会使用到这个启动spring/tomcat
//        new EmbeddedWebApplicationContext();
    }


    @Test
    public  void  testLookUp() {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        LookUptest lookUptest = (LookUptest)classPathXmlApplicationContext.getBean("lookUptest") ;
        lookUptest.say();
    }
}
