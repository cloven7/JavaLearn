package everyday.day6.singleton;

/**
 * @Description 单例设计模式 静态内部类 懒汉
 * @Author clovenine
 * @Date 2022/7/6 18:53
 */
public class Singleton3 {

    // 让别人不能new,私有化无参构造
    private Singleton3(){

    }

    // 静态内部类会在第一次使用时加载一次，静态常量会在类加载后初始化，一次。
    public static Singleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // 静态内部类
    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }


}
