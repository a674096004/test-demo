package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: User
 * @Date: 2020/1/7 22:52
 * @Description:
 */
public class Test {

    /**
     * 适配器解决了大量if else 判断
     * 责任链也可以解决大量if else问题，但是责任链第一个处理完进行下一个比适配器效率慢
     * 大量if else会有什么问题？1.看起来不优雅，2不符合代码的开闭原则
     * @param args
     */
    public static void main(String[] args) {
        List<Province> list = new ArrayList<>();
        list.add(new HN());
        list.add(new HN1());
        String prov = "henan";
        list.forEach((str) -> {
            if (str.vaild(prov)) {
                str.say();
            }
        } );
    }
}
