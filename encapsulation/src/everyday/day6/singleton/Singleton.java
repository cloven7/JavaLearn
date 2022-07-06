package everyday.day6.singleton;

/**
 * @Description 单例设计模式 饿汉
 * @Author clovenine
 * @Date 2022/7/6 18:53
 */
public class Singleton {

    // 让别人不能new,私有化无参构造
    private Singleton(){

    }

    // 初始化一个 ---- 饿汉式单例
    private static final Singleton INSTANCE = new Singleton();



    // 保证别人能获取
    public static Singleton getInstance(){
        return INSTANCE;
    }

}
