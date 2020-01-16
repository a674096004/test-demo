package knownlambda;

/**
 * @auther: User
 * @Date: 2020/1/6 09:52
 * @Description:
 */
public class LambdaTest {

    public static  void testPrint (String str,PrintInterFace<String> printInterFace) {
        if ("a".equals(str)) {
            System.out.println("aaaaaaa");
        } else if ("b".equals(str)) {
            System.out.println("bbbbbbb");
        } else {
            System.out.println("default");
        }
    }

    public static  String testPrintReturn (String str1,String str2, PrintIReturnnterFace<String> printInterFace) {
        return str1+str2;
    }
    public static void main(String[] args) {
        testPrint("aaa", (str) -> System.out.println(str));

        /**
         * 如果表达式方法体有内容，重写方法，修改无效
         * 返回仍是 str1+str2
         */
        String str = testPrintReturn("aaa","bbb", (str1,str2) -> {
            return str1 + "###" + str2;
        });
        System.out.println(str);
    }
}
