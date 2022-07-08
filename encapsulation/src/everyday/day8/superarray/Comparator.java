package everyday.day8.superarray;

/**
 * @Description 第二种写法，除了给定类型外，使用泛型
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 17:10
 * @Version 1.0
 */
@FunctionalInterface
public interface Comparator<T> {
	public Integer compare(T user, T user1);
}
