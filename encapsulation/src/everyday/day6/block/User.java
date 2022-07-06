package everyday.day6.block;

/**
 * @Description 静态代码块和实例代码块
 * @Author clovenine
 * @Date 2022/7/6 15:31
 */
public class User {

    // 类会在第一次使用的时候，从磁盘加载到内存里面（一个类就加载一次）
    // 静态代码块
    static {
        System.out.println("I am a static code  block!");
    }

    // 实例代码块
    {
        System.out.println("I am a instance code block!");
    }

    public static void main(String[] args) {
        new User();
        new User();
    }

}
