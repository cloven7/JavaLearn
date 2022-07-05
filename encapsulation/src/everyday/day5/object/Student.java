package everyday.day5.object;

/**
 * @Description 实现浅拷贝和深拷贝
 * @Author clovenine
 * @Date 2022/7/5 10:45
 */
public class Student {

    private String name;

    public Student() {
        this.name = "CBA";

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
