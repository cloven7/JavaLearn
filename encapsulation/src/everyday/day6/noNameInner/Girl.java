package everyday.day6.noNameInner;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/6 19:25
 * @Version 1.0
 */
public class Girl {

    public void feet(Pet pet){
        if(pet instanceof Dog){
            Dog dog = (Dog) pet;
            dog.eat();
        } else if(pet instanceof Pet){
            pet.eat();
            System.out.println("hello");
        }
    }

    // 接口实现匿名内部类
    public static void main(String[] args) {
        Girl girl = new Girl();

        Pet dog = new Dog();
        girl.feet(dog);
        int iooo = 7;
        girl.feet(new Dog(){
            @Override
            public void eat() {
                System.out.println(iooo);
                System.out.println("zhu is eating");
            }

        });

    }

}
