package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther: User
 * @Date: 2020/1/16 14:39
 * @Description:
 */
@Data
public class UserEntiry implements Serializable {
    private String id;
    private String name;
    private String address;
    private long balance;
}
