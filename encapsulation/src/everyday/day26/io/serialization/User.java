package everyday.day26.io.serialization;

import java.io.Serializable;

/**
 * @Description 序列化和反序列化对象
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 17:26
 * @Version 1.0
 */
public class User implements Serializable{

//	String to = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt";
//	private static final long serialVersionUID = 1L;// 序列号
	private int age;
	private transient String name;// transient关键字修饰，不会被序列化

	public User() {
	}

	public User(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"age=" + age +
				'}';
	}

	public void eat(){

	}

}
