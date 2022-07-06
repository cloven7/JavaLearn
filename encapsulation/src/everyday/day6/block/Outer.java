package everyday.day6.block;

/**
 * @Description 内部类实现
 * @Author clovenine
 * @Date 2022/7/6 18:34
 */
public class Outer {

    public Outer() {
        System.out.println("outer");
    }

    // 内部类
    public class inner{

        public inner() {
            System.out.println("inner");
        }
    }
    public void test(){
        new inner();
    }

    public static void main(String[] args) {
        new Outer().test();
    }

}
