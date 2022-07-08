package everyday.day8.superarray;

/**
 * @Description 学生数组
 * @Author clovenine
 * @Date 2022/7/8 15:54
 */
public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public void play(){
		System.out.println(this.name + " is playing !QAQ");
	}
}
