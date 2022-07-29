package everyday.day27.annotations;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/27 9:38
 * @Version 1.0
 */
public class ReflectTest {

	Class<Dog> clazz = null;

	@Before
	public void before(){
		clazz = Dog.class;
	}

	@Test
	public void createTest(){

	}

	@Test
	public void clazzTest(){
//		clazz.getClassLoader();//
		System.out.println("clazz.isInterface() = " + clazz.isInterface());
		System.out.println("clazz.isArray() = " + clazz.isArray());
//		System.out.println("clazz.newInstance() = " + clazz.newInstance());
//		Dog dog = clazz.newInstance(); // 拿到一个实例对象

	}

	// 反射操作成员变量
	@Test
	public void fieldTest() throws NoSuchFieldException, IllegalAccessException {

		// 这个方法只能拿到public修饰的成员变量
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field.getName()); //public String name
		}

		System.out.println("---------------");
		// 这个方法能拿到所有的成员变量
		for (Field declaredField : clazz.getDeclaredFields()) {
			System.out.println(declaredField.getName());
		}
		// 成员变量的本质就是赋值和取值，现在给谁赋值
		Dog dog = new Dog(12);
		Field age = clazz.getDeclaredField("age");
		// 直接设置值，不能是private
		age.setAccessible(true); // 打开访问权限，暴力注入
		age.set(dog, 114514);
		Object o = age.get(dog);
		System.out.println(age.get(dog));
		System.out.println(dog.getAge());
	}


	// 反射操作方法
	@Test
	public void methodTest() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		// getDeclaredMethods 不拿父类的方法，但是可以拿到本类所有的成员方法
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("------------");
		Method eat1 = clazz.getDeclaredMethod("eat");
		Method eat = clazz.getDeclaredMethod("eat", String.class);/*,int.class 多个参数*/

		// 对方法而言，只有一个核心方法，就是调用
		eat.setAccessible(true);
		Dog dog = new Dog(12);
		eat.invoke(dog, "shift");
		eat1.setAccessible(true);
		eat1.invoke(dog);
	}

	// 反射操作方法
	@Test
	public void constructorTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor<?> declaredConstructor : declaredConstructors) {
			System.out.println(declaredConstructor.getName());
		}

		// 获取无参构造，并且构造对象
		Constructor<Dog> constructor = clazz.getDeclaredConstructor();
		Dog dog = constructor.newInstance(); // new Dong(); clazz.getInstantce()

		// 获取有参构造器，并且构造对象
		Constructor<Dog> constructor1 = clazz.getDeclaredConstructor(int.class);
//		constructor1.setAccessible(true);
		Dog dog1 = constructor1.newInstance(114514);
		System.out.println(dog1.getAge());
	}


	// 反射操作注解
	@Test
	public void annotationTest() throws NoSuchFieldException, NoSuchMethodException {
		// 类的注解
		Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
		MyAnnotationsTest annotation = clazz.getAnnotation(MyAnnotationsTest.class);
		String name = annotation.name();
		System.out.println("name = " + name);

		// 成员变量
		Field age = clazz.getDeclaredField("age");
		Annotation[] declaredAnnotations1 = age.getDeclaredAnnotations();


		// 成员方法
		Method eat = clazz.getDeclaredMethod("eat");
		Annotation[] declaredAnnotations2 = eat.getDeclaredAnnotations();



	}
}
