package everyday.day5.polymorphism;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/5 14:44
 * @Version 1.0
 */
public class Dog extends Pet{

    public String name = "Dog name";

    @Override

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void coquetry() {
        System.out.println("狗在撒娇！");
    }

    public void print(){
        System.out.println("I am a dog!");
    }

}
