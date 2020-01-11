package wpy.test;

import org.junit.Test;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import wpy.bean.Student;
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
        Student student = (Student) annotationConfigApplicationContext.getBean("student");
        System.out.println(student.getName());
    }

    @Test
    public void testXml() {
        // xml启动
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student1 stu1 = (Student1) classPathXmlApplicationContext.getBean("student1");
        System.out.println(stu1.getName());
    }
    @Test
    public void testOther() {
        // 基本用不到
//        new FileSystemXmlApplicationContext("");
        // springboot启动会使用到这个启动spring/tomcat
//        new EmbeddedWebApplicationContext();
    }
}
