package everyday.day8.superarray;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 18:07
 * @Version 1.0
 */
public interface Super<T> {


	// 使用构造器初始化

	// [capacity 容量]

	// 对数据的增删改查
	// 增加一个元素
	void add(T data);

	// 头插
	void addToHeader(T data);

	// 尾插
	void addToTail(T data);

	// 指定下标处增加一个元素
	void add(int index, T data);

	// 删除下标的元素
	void delete(int index);

	// 修改下标的元素
	void set(int index, T data);

	// 查找数据
	Object select(int index);

	// 获取长度
	int getSize();

	// 把数组变成字符串
	String arrayToString();

}
