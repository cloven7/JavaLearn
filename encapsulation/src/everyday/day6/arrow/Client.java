package everyday.day6.arrow;

/**
 * @Description 场景
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 20:22
 * @Version 1.0
 */
public class Client {

    public static void test(Function function){
        System.out.println(function.plus(1, 2));
    }

    public static void main(String[] args) {
        /*Function function = new Function() {
            @Override
            public int plus(int i, int j) {
                return i + j;
            }
        };*/
//        Function function = (i, j) -> i + j; // 本质上是匿名内部类


//        System.out.println(function.plus(2, 3));

        test((i, j) -> i + j);
    }
}
