package adapter;

/**
 * @auther: User
 * @Date: 2020/1/7 22:46
 * @Description:
 */
public class HN implements Province {

    private static final String FLAG = "henan";
    @Override
    public boolean vaild(String flag) {
        if (FLAG.equals(flag)) {
            return  true;
        }
        return false;
    }

    @Override
    public void say() {
        System.out.println("this is HeNan");
    }
}
