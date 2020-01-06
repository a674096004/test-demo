package knownlambda;

/**
 * @auther: User
 * @Date: 2020/1/6 09:49
 * @Description:
 */
@FunctionalInterface
public interface PrintInterFace<T> {
    void print(T t);
}
