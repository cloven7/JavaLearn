package everyday.day6.templateMethod;

/**
 * @Description 模板方法设计模式 抽象类
 * @Author clovenine
 * @Date 2022/7/6 9:51
 */
public abstract class Prisoner {

    protected String name;

    /**
     * @Description 劳动的方法
     * @Author clovenine
     * @Date 2022/7/6 9:52
     */
    abstract void work();

    /**
     * @Description 吃的方法
     * @Author clovenine
     * @Date 2022/7/6 9:52
     */
    abstract void eat();

    /**
     * @Description 看新闻
     * @Author clovenine
     * @Date 2022/7/6 9:53
     */
    abstract void readNews();

    /**
     * @Description 一天的生活 --- 模板
     * @Author clovenine
     * @Date 2022/7/6 9:54
     */
    public void life(){
        eat();
        work();
        eat();
        work();
        eat();
        readNews();
    }


}
