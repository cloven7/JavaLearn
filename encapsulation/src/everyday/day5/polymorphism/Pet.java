package everyday.day5.polymorphism;

/**
 * @Description 多态代码示例
 * @Author clovenine
 * @Date 2022/7/5 14:43
 */
public class Pet {

    public String name = "Pet name";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void coquetry(){
        System.out.println("宠物在撒娇!");
    }

}
