package everyday.day5.polymorphism;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/5 15:27
 * @Version 1.0
 */
public class Computer {

    public int plus(int i,int j){
        return i+j;
    }

    public void tests(Dog object){
        System.out.println("class dog");
    }
    public void tests(Object object){
        System.out.println("object");
    }

    public static void main(String[] args) {
//        Computer computer = new Computer();
//        System.out.println(computer.plus(2,4));
        Computer computer = new Computer();
        Dog dog = new Dog();
        computer.tests(dog);

    }

}
