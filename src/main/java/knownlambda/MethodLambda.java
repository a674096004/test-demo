package knownlambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @auther: User
 * @Date: 2020/1/3 14:22
 * @Description:
 */
public class MethodLambda {

    /**
     * Lambda做方法的引用
     * 方法的引用不是方法的调用！！！
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","ccc");
        int i = 0;
        list.forEach(str -> {
            System.out.println("处理逻辑-----");
            System.out.println("打印str:" + str);
        });
        System.out.println("==================");
        list.forEach(System.out::println);
        System.out.println("==================");
        List<String> list1 = list.stream().map(
                name -> {return name.toUpperCase();}
        ).collect(Collectors.toList());
        System.out.println(list1);
    }
}
