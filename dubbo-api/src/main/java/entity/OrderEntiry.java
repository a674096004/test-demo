package entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther: User
 * @Date: 2020/1/16 14:36
 * @Description:
 */
@Data
public class OrderEntiry implements Serializable {
    private String id;
    private long money;
    private String userId;
    private int status = 0;
    private List<ProductEntiry> productlist = new ArrayList<>();
}
