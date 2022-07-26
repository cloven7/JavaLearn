package everyday.day25.java8newthing.lamdba;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Description 实现函数式接口
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 15:48
 * @Version 1.0
 */
public class ToUpper {

	public static void main(String[] args) {
		Function<String, String> function = new Function<String, String>() {
			@Override
			public String apply(String s) {
				return s.toUpperCase();
			}
		};

		Function<String, String> function1 = s -> s.toUpperCase();
		System.out.println("function1.apply(\"aaa\") = " + function1.apply("aaa"));

		// 消费式
		Consumer<String> consumer = c -> System.out.println(c);
		// 更加简单的写法
		Consumer<String> consumer1 = System.out::println;
		consumer.accept("Hello world!");

		// 提供商 小括号()只能在有一个参数时省略
		Supplier<String> supplier = () -> "hello Supplier";
		System.out.println("supplier.get() = " + supplier.get());

		// 断言
		Predicate<String> predicate = p -> p.contains("a");
		// 匿名内部类实现
		Predicate<String> predicate1 = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return false;
			}
		};
		System.out.println("predicate.test(\"abc\") = " + predicate.test("abc"));
	}

}
