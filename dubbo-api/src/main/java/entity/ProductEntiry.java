package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther: User
 * @Date: 2020/1/16 14:36
 * @Description:
 */
@Data
public class ProductEntiry implements Serializable {
    private String id;
    private long price;
    private String name;
    private int status;//上下架
}
