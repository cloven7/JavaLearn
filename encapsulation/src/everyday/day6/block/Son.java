package everyday.day6.block;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 16:04
 * @Version 1.0
 */
public class Son extends Father {

    public Son(){
        System.out.println("这是子类的构造器！");
    }

    {
        System.out.println("这是子类的实例代码快！");
    }

    static {
        System.out.println("这是子类的静态代码快！");
    }

    public static void main(String[] args) {
        new Son();
    }
}