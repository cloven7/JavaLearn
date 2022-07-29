package everyday.day27.annotations;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 20:23
 * @Version 1.0
 */

//@MyAnnotationsTest(name = "juruo", age = 12, value = 13)
public class MyTest {

	@MyAnnotationsTest(name = "juruo", age = 12, value = 13)
	public void juRuo(){

	}

//	@MyAnnotationsTest(name = "juruo", age = 12, value = 13)
//	public MyTest() {
//	}
//
//	@MyAnnotationsTest(name = "juruo", age = 12, value = 13)
//	public MyTest(String string) {
//		this.string = string;
//	}

	@MyAnnotationsTest(name = "juruo", age = 12, value = 13)
	public String string;

	@SuppressWarnings("all") // 压制所有警告 // unused
	public static void main(String[] args) {

		int a;
		Dog dog = new Dog(12);
		dog.setAge(123);


		// 反射：获取class对象
		// 1.使用类名
		Class<Dog> clazz = Dog.class;
		// 2.使用对象
		Class<? extends Dog> clazz2 = dog.getClass();
		// 3.全限定名称
		try {
			Class<?> clazz3 = Class.forName("everyday.day27.annotations.Dog");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
