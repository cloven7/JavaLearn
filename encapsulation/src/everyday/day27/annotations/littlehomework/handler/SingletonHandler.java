package everyday.day27.annotations.littlehomework.handler;

import everyday.day27.annotations.littlehomework.annotation.Singleton;
import everyday.day27.annotations.littlehomework.context.ApplicationContext;

import java.util.List;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 9:49
 * @Version 1.0
 */
public class SingletonHandler {

	public static void handler(List<String> collect) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		for (String className : collect) {
			Class<?> aClass = Class.forName(className);
			// 获取注解
			Singleton annotation = aClass.getAnnotation(Singleton.class);
			if(annotation != null){
				Object o = aClass.newInstance();
				ApplicationContext.addSingleton(aClass, o);
			}
		}

	}

}
