package everyday.day8.genericity.clean;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 20:56
 * @Version 1.0
 */
class Pair<T> {
	private T value;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}