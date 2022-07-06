package everyday.day6.block;

/**
 * @Description 静态代变量和成员变量的赋值
 * @Author clovenine
 * @Date 2022/7/6 16:19
 */
public class User1 {

    public static String name1 = "ydlclass";
    public String name2 = "ydlclass";

    public static void print(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println(User1.name1);
        User1.print();
//        User1 user1 = new User1();
//        user1.print();
        new User1();
    }


}
