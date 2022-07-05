package everyday.day5.object;

/**
 * @Description 重写equal方法 重写toString方法 使用clone
 * @Author clovenine
 * @Date 2022/7/5 9:53
 */
public class Teacher implements Cloneable{//必须加上这一句才允许clone

    private int id;
    private String name;
    private int age;
    public Student student;

    public Teacher() {
    }

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object){
        Teacher teacher = (Teacher) object;
        return teacher.id == this.getId()
                && teacher.getName().equals(this.getName());
    }

/*    @Override
    public String toString(){
        return "hello world!";
    }*/
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
