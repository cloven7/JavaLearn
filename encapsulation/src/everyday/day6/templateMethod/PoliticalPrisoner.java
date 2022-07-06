package everyday.day6.templateMethod;

/**
 * @Description 政治罪犯
 * @Author clovenine
 * @Date 2022/7/6 10:15
 */
public class PoliticalPrisoner extends Prisoner{

    public PoliticalPrisoner(String name){
        this.name = name;
    }

    @Override
    void work() {
        System.out.println(this.name + "在劳动");
    }

    @Override
    void eat() {
        System.out.println(this.name + "在吃饭");
    }

    @Override
    void readNews() {
        System.out.println(this.name + "在看新闻");
    }
}
