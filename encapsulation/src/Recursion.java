/**
 * @Description 斐波那契数列（递归）
 * @Author clovenine
 * @Date 2022/7/1 22:01
 */

public class Recursion {
    /**
     * @Description  斐波那契数列第几项是多少
     * @Param [num]
     * @Return java.lang.long
     * @Author clovenine
     * @Date 2022/7/1 22:00
     */
    public int fibonacci(int num){
        if(num == 0 || num == 1)
            return num;
        else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args){
        Recursion recursion = new Recursion();
        int f = recursion.fibonacci(10);
        System.out.println(f);
    }
}
