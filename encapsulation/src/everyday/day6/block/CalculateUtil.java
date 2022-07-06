package everyday.day6.block;

/**
 * @Description 静态方法和静态常量的使用场景 工具类
 * @Author clovenine
 * @Date 2022/7/6 18:15
 */
public class CalculateUtil {

    public static int plus(int i,int j){
        return i + j;
    }

    public static int minus(int i,int j){
        return i - j;
    }


    public static void main(String[] args) {
        System.out.println(CalculateUtil.plus(2 , 3));
        System.out.println(CalculateUtil.minus(2 , 3));
    }
}
