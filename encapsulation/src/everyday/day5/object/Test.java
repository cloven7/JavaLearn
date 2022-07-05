package everyday.day5.object;

/**
 * @Description 重写object类中的equals方法
 * @Author clovenine
 * @Date 2022/7/5 9:58
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t1 = new Teacher(11, "lucy", 24);
        Student s1 = new Student("zhangSan");
        t1.setStudent(s1);

        Teacher t2 = (Teacher) t1.clone();
        Teacher t3 = new Teacher(11, "lucy", 24);

        t2.getStudent().setName("lisi");

//        System.out.println(t1 == t2);
//        System.out.println(t1.equals(t3));
        System.out.println(t1.getStudent().getName());
        System.out.println(t3);
        System.out.println(t2.getStudent().getName());

    }

}
