package wpy.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * @auther: User
 * @Date: 2020/1/13 23:
 * @Description:
 */

 public abstract class LookUptest {

    public abstract Pepole getPepole();

    public void say() {
        getPepole().say();
    }
}
