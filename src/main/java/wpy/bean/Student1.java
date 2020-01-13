package wpy.bean;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @auther: User
 * @Date: 2020/1/11 22:09
 * @Description: xml
 */
@Data
@Service
public class Student1 {
    private String name = "student1";
    private String pwd;
}
