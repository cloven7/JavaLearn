package everyday.day3;

/**
 * @Description getter and setter
 * @Author clovenine
 * @Date 2022/7/3 21:01
 */
public class Girl {

    private int age;
    public String name;

    public static void main(String[] args){
        Girl girl = new Girl();
        girl.age = 56;
        girl.name = "stifen.lili";
        char[] girlName = girl.name.toCharArray();
        String getname = new String(girlName, 7, 4);
        System.out.println(getname);
    }

    public void setAge(int age){
        if(age > 18){
            this.age = 18;
        }
        else
        {
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

}
