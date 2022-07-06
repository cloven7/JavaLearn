package everyday.day6.singleton;

/**
 * @Description 单例设计模式 懒汉
 * @Author clovenine
 * @Date 2022/7/6 18:53
 */
public class Singleton2 {

    // 初始化一个 ---- 懒汉式单例
    private static Singleton2 INSTANCE;

    // 让别人不能new,私有化无参构造
    private Singleton2(){

    }

    // 保证别人能获取
    public static Singleton2 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
