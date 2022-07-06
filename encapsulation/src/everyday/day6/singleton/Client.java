package everyday.day6.singleton;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 18:58
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Singleton3 singleton = Singleton3.getInstance();
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();
        System.out.println(singleton == singleton1); //内存一样
        System.out.println(singleton2 == singleton3);

    }

}
