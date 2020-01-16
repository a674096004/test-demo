package wpy.bean;

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
