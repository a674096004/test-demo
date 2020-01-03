package knownlambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @auther: User
 * @Date: 2020/1/3 11:01
 * @Description:
        noParams();
        hasParams();

 */
        public class SampleLambda {
            public static void main(String[] args) {

                /**
                 * Lambda表达式是建立在函数式接口的基础上
                 * 什么是函数式接口，只包含一个抽象方法的接口，如 Comparator Runnable
                 * 可以通过Lambda表达式创建该接口的对象
                 */
                hasParams();
    }

    private static void hasParams() {
        String[] arr1 = {"zzbcc","vmm","aaa"};
        String[] arr2 = {"zzbcc","vmm","aaa"};
        String[] arr3 = {"zzbcc","vmm","aaa"};
        String[] arr4 = {"zzbcc","vmm","aaa"};
        Arrays.sort(arr1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("arr1=========" + Arrays.toString(arr1));
        Arrays.sort(arr2, (s1,s2) -> s1.compareTo(s2));
        System.out.println("arr2=========" + Arrays.toString(arr2));

        Arrays.sort(arr3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println("arr3=========" + Arrays.toString(arr3));
        Arrays.sort(arr4, (s1,s2) -> s1.length()-s2.length());
        System.out.println("arr4=========" + Arrays.toString(arr4));
    }

    private static void noParams() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类----run()");
            }
        }).start();
        new Thread(() -> System.out.println("lambda---run()")).start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1------run()");
            }
        };
        Runnable r2 = () -> System.out.println("r2-lambda--run()");
        r1.run();
        r2.run();
    }
}
