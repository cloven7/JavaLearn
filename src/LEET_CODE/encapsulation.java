package LEET_CODE;

/**
 * 面向对象之封装
 */

public class encapsulation {
    // 汽车的型号
    String brand;
    // 汽车的颜色
    String color;
    // 汽车的长度
    long length;

    public static void main(String[] args) {
        encapsulation Car1 = new encapsulation();
        Car1.brand = "dsjof";
        Car1.color = "red";
        Car1.length = 123;
        System.out.println(Car1.brand);
    }
}

///
//class Car{
//    String brand;
//    // 汽车的颜色
//    String color;
//    // 汽车的长度
//    long length;
//}