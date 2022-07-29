package everyday.day27.annotations;

import everyday.day27.annotations.littlehomework.annotation.Singleton;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/27 9:02
 * @Version 1.0
 */
@Singleton
@MyAnnotationsTest(name = "na", age = 1, value = 1)
public class Dog {

	private int age;
	public String name;

	private void eat(){
		System.out.println("I am eating");
	}

	public void eat(String food){
		System.out.println("food = " + food);
	}

	public int getAge() {
		return age;
	}

	@Deprecated
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"age=" + age +
				'}';
	}

	public Dog() {
	}

	public Dog(int age) {
		this.age = age;
	}
}
