package wpy.bean;

/**
 * @auther: User
 * @Date: 2020/1/13 23:13
 * @Description:
 */
public class Man implements Pepole {

    //autowire-candidate false报错
    // No qualifying bean of type 'wpy.bean.Candidate' available
//    @Autowired
//    Candidate candidate;

    @Override
    public void say() {
        System.out.println("Hi, man ");
    }
}
