package everyday.day26.copy;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 18:03
 * @Version 1.0
 */
public class Dog implements Serializable {

	@Serial
	private static final long serialVersionUID = -4413341534901894564L;

	private int age;

	public Dog(int age) {
		this.age = age;
	}

	public Dog() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"age=" + age +
				'}';
	}
}
