package everyday.day27.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 20:22
 * @Version 1.0
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})// 只能在字段(成员变量)和方法上使用，限定注解放置的位置（类，构造器上都不能加）
// TYPE 接口、类上

//SOURCE源代码级别，一旦编译，注解消失，编译（编译器javac）结束后消失
//CLASS编译后，注解还可以保留到class文件中（默认选项）运行前 jvm加载到内存之后消失
//RUNTIME保存在内存中，

@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotationsTest {
	String name();
	int age();

	// 如果属性不需要指定具体的名字，只需要将方法名字写成value， value()唯一
	int id() default 7;
	// 如果有其它属性，value赋值时，不能省略名字
	int value();


}
