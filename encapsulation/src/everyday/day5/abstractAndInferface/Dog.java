package everyday.day5.abstractAndInferface;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/5 20:45
 * @Version 1.0
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }
}
