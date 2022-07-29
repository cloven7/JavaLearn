package everyday.day27.annotations.littlehomework.context;

import everyday.day27.annotations.Dog;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 9:36
 * @Version 1.0
 */
public class ApplicationContext {

	// 维护一个上下文环境
	private final static Map<Class<?>, Object> CONTEXT = new ConcurrentHashMap<>(8);

	public static void addSingleton(Class<?> clazz, Object entity){
		ApplicationContext.CONTEXT.put(clazz, entity);
	}

	// 把实例对象从容器拿出来
	public static <T> T getSingleton(Class<T> clazz){
		return (T) ApplicationContext.CONTEXT.get(clazz);
	}

	public static void main(String[] args) {
		ApplicationContext.addSingleton(Dog.class, new Dog());
		Dog singleton = ApplicationContext.getSingleton(Dog.class); // 目的在此

	}

}
