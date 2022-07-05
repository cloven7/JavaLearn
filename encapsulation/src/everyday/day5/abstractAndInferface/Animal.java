package everyday.day5.abstractAndInferface;

/**
 * @Description 有抽象方法的类，必须声明成抽象类
 * @Author clovenine
 * @Date 2022/7/5 19:57
 */
public abstract class Animal {

    private String name;


    public abstract void eat();//约定子类必须实现

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }

}
