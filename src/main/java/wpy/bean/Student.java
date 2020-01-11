package wpy.bean;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @auther: User
 * @Date: 2020/1/11 22:09
 * @Description:
 */
@Data
@Service
public class Student {
    private String name = "student";
    private String pwd;
}
