package everyday.day6.delivery;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 20:49
 * @Version 1.0
 */
public class Animal {

    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Animal animal){
        animal.setName("猪");
        System.out.println(this.name + "吃了" + animal.getName());
    }
    /****--- 值传递深入案例 ---****/
    public static void changeString(String str){
        str = "hello";
    }

    public static void main(String[] args) {
        String str = "wo shi da ge da !";
        changeString(str);
        System.out.println(str);
    }

}
