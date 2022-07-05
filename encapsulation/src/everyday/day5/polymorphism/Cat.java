package everyday.day5.polymorphism;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/5 14:46
 * @Version 1.0
 */
public class Cat extends Pet{

    @Override
    public void coquetry() {
        System.out.println("猫在撒娇！");
    }
}
