package everyday.day4.inheritance;

/**
 * @Description 测试继承关系
 * @Author clovenine
 * @Date 2022/7/4 20:08
 */
public class Test {

    public static void main(String[] args){
        Son son = new Son();
        son.eat();
        System.out.println(son.name);
//
        GrandSon grandSon = new GrandSon();
        grandSon.eat();

    }



}
