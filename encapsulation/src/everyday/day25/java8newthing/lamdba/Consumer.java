package everyday.day25.java8newthing.lamdba;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 15:44
 * @Version 1.0
 */

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}
