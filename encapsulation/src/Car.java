/*
    面向对象
 */

public class Car {//类名驼峰式命名，首字母大写，变量名、方法名驼峰式命名，首字母小写
    // 对象的属性-->成员变量
    // 汽车的型号
    String brand;
    // 汽车的颜色
    String color;
    // 汽车的长度
    long length;


    // 对象的方法-->成员方法
    /**
     * @Description 启动车
     * @Param
     * @Return java.lang.void
     * @Author clovenine
     * @Date 2022/7/1 21:29
     * @Version 1.0
     */
    public void run(){
        System.out.println("它跑起来了");
    }

    /**
     * @Description 描述车子状态
     * @Param
     * @Return java.lang.boolean
     * @Author clovenine
     * @Date 2022/7/1 21:30
     * @Version 1.0
     */
    public boolean carState(){
        // 生成一个0~1的double数字
        double random = Math.random();
        if(random > 0.5){
            System.out.println("车子正常启动！");
            return true;
        }else{
            System.out.println("车子坏了！");
            return false;
        }
    }

    /**
     * @Description 方法重载
     * @Param [i]
     * @Author clovenine
     * @Date 2022/7/1 22:16
     */
    public void run(int i){
        System.out.println("kkkkkkk");
    }

    /**
     * @Description 可变参数(本质上是数组) 语法糖...hhhh
     * @Param [i]
     * @Author clovenine
     * @Date 2022/7/1 22:16
     */
    public void run(int... nums){
        for(int i = 0; i < nums.length; i++)

            System.out.println("k");
        return;
    }

    public static void main(String[] args){
        Car car1 = new Car();//new  去堆内存分配空间 // <变量>car1 在栈内存
        car1.color = "red";
        car1.length = 4321;
        car1.brand = "奔驰";

        System.out.println(car1);//jvm时会将符号引用转化成内存地址
        System.out.println(car1.color);

        Car bwm = new Car();//对象是要被初始化的，之后成员变量会有默认值null
        bwm.color = "white";
        bwm.length = 4331;
        bwm.brand = "宝马";


        Car[] cars = {car1, bwm};
        for(int i = 0; i < cars.length; i++){
            System.out.println("--- " + cars[i].color + " ---");
            boolean carState = cars[i].carState();
            if(carState)
                System.out.println("回家");
            else
                System.out.println("修车");
            System.out.println(cars[i].carState());
            cars[i].run();
            cars[i].run(1);
        }
    }
}
