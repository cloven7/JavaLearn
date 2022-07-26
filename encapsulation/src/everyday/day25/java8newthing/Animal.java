package everyday.day25.java8newthing;

/**
 * @Description interface中的默认方法（java8新特性）
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 15:28
 * @Version 1.0
 */
public interface Animal {
	// 静态常量
	int NUM = 1;

	// 静态方法
	static void eat(){

	}
	// 普通方法的实现
	// 属于实例对象，实例对象没有创建，方法就不能有
	// 只能有抽象方法，留给子类实现，让子类拥有某种能力
	void say();

	// java8 默认方法
	default void sleep(){
		System.out.println("I am sleeping!");
	}

	static class Dog implements Animal{
		@Override
		public void say() {
			System.out.println("I am saying!");
		}
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.say();
		dog.say();
		dog.sleep();
	}

}
