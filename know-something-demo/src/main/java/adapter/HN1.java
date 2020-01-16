package adapter;

/**
 * @auther: User
 * @Date: 2020/1/7 22:49
 * @Description:
 */
public class HN1 implements Province {

    private static final String FLAG = "hunan";
    @Override
    public boolean vaild(String flag) {
        if (FLAG.equals(flag)) {
            return true;
        }
        return false;
    }

    @Override
    public void say() {
        System.out.println("this is HuNan");
    }
}
