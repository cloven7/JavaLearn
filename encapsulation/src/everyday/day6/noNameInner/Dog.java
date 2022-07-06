package everyday.day6.noNameInner;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 19:24
 * @Version 1.0
 */
public class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
