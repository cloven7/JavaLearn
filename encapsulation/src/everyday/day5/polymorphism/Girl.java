package everyday.day5.polymorphism;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/5 14:47
 * @Version 1.0
 */
public class Girl {

    //子类转成父类，自动向上转型,但是会丢失特性
    public void feed(Pet pet){
//        pet.coquetry();
//        System.out.println("pet ...");
        pet.coquetry();
        //向下转型，父类转换成子类,保证传入的就是Dog
        if(pet instanceof Dog){// 判断是否是Dog类
            Dog dog = (Dog)pet;
            dog.print();
        }

        //向下转型


    }
//    public void feed(Cat pet){
//        pet.coquetry();
//        System.out.println("cat ...");
//    }
//    public void feed(Dog pet){
//        pet.coquetry();
//        System.out.println("dog ...");
//    }

    public static void main(String[] args) {
        Girl girl = new Girl();

        girl.feed(new Dog());


        //Dog dog = new Dog();
//        Pet cat = new Cat();
        Pet pet = new Dog();
//
        Dog dog = (Dog)pet;
        dog.print();
//
//        System.out.println(dog.name);
//        System.out.println(dog.getName());



//        girl.feed(dog);
//        girl.feed(cat);
//        girl.feed(pet);
    }

}
