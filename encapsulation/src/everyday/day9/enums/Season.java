package everyday.day9.enums;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/9 8:40
 * @Version 1.0
 */
public class Season {

	private int age;
	private String name;

	public Season(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Season() {
	}

	public static final Season SPRING = new Season(1, "春天");
	public static final Season SUMMER = new Season(2, "夏天");
	public static final Season AUTUMN = new Season(3, "秋天");
	public static final Season WINTER = new Season(4, "冬天");

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println(SPRING.age);
	}
}
