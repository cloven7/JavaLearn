package everyday.day6.delivery;

import java.util.Arrays;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 20:49
 * @Version 1.0
 */
public class Tiger extends Animal{

    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void changeDog(Tiger tiger){
        tiger = new Tiger("juruo");
    //    tiger.setName("juruo");
    }



    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        /****--- main方法深入 ---****/
        System.out.println(Arrays.toString(args));


        /****--- 值传递深入案例 ---****/
        Tiger tiger = new Tiger("gumayusi");
        tiger.changeDog(tiger);
        System.out.println(tiger.getName());
        System.out.println(tiger);

        /****--- 值传递和引用传递 ---****/
        /*Animal animal = new Animal();
        Animal animal1 = new Animal();
        String name = "老虎";
        Integer age = 12;
        animal.setName(name);
        animal.setAge(age);

        animal1.setName("羊");
        animal.eat(animal1); // 引用传递
        System.out.println(animal1);

        System.out.println("---------------");
        System.out.println(age);
        System.out.println(name);

        System.out.println(animal1.getName());*/





    }

}
