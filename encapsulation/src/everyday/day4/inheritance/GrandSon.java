package everyday.day4.inheritance;

/**
 * @Description 继承自Son
 * @Author clovenine
 * @Date 2022/7/4 20:10
 */
public class GrandSon extends Son{

    public GrandSon() {
        System.out.println(super.name + "I am a grandson!");
    }

    @Override
    public void eat(){
        System.out.println("grandson is eating");
    }

    public void work(){
        //super("name");
        System.out.println("grandson is working!");
    }

}
