package everyday.day26.copy;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description 深拷贝 实现Serializable, Cloneable接口
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 18:05
 * @Version 1.0
 */
public class User implements Serializable, Cloneable {

	@Serial
	private static final long serialVersionUID = -4286951039820632841L;

	private int age;
	private String name;
	private Dog dog;

	@Override
	public String toString() {
		return "User{" +
				"age=" + age +
				", name='" + name + '\'' +
				", dog=" + dog +
				'}';
	}

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

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public User() {
	}

	public User(int age, String name, Dog dog) {
		this.age = age;
		this.name = name;
		this.dog = dog;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
