package everyday.day5.test;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/5 17:12
 * @Version 1.0
 */
public class Overload {

    public void sayHello(Object arg){
        System.out.println("hello object");
    }

    public void sayHello(int arg){
        System.out.println("hello int");
    }

    public void sayHello(long arg){
        System.out.println("hello long");
    }

    public void sayHello(Character arg){
        System.out.println("hello Character");
    }

    public void sayHello(char arg){
        System.out.println("hello char");
    }

    public void sayHello(char... arg){
        System.out.println("hello char...");
    }


    public static void main(String[] args) {
        new Overload().sayHello('a');
    }

}
