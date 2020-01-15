package wpy.bean;

/**
 * @auther: User
 * @Date: 2020/1/13 22:59
 * @Description:
 */
public class AutowirCandidateClass implements Candidate {

    @Override
    public  void test() {
        System.out.println("====AutowirCandidateClass===");
    }
}
