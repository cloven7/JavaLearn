package everyday.day4.inheritance;

/**
 * @Description 面向对象之继承
 * @Author clovenine
 * @Date 2022/7/4 20:05
 */
public class Father {
    public Father(String name) {
        this.name = name;
    }

    public Father() {
        System.out.println("I am a father!");
    }

    public String name = "juruo";

    public void eat(){
        System.out.println("father is eating");
    }
}
