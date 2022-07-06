package everyday.day6.templateMethod;

/**
 * @Description 明星入狱
 * @Author clovenine
 * @Date 2022/7/6 9:55
 */
public class Star extends Prisoner{

    public Star(String name){
        this.name = name;
    }

    @Override
    void work() {
        System.out.println(this.name + "在边唱歌边劳动");
    }

    @Override
    void eat() {
        System.out.println(this.name + "在边唱歌边吃饭");
    }

    @Override
    void readNews() {
        System.out.println(this.name + "在边唱歌边看新闻");
    }
}
