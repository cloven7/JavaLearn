package everyday.day4.inheritance;

/**
 * @Description 继承自Father
 * @Author clovenine
 * @Date 2022/7/4 20:07
 */
public class Son extends Father{

    //public String name = "GGBoy";
    public Son(String name){
        super("name");
    }
    public Son() {
        super("jojo name");
        System.out.println("I am a son!");
    }

    @Override
    public void eat(){
        System.out.println("son is not eating");
    }

    public void play(){
        System.out.println("son is playing!");
        System.out.println(super.name);
    }
}
