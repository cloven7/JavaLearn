package everyday.day25;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 9:23
 * @Version 1.0
 */
public class LRU<K, V> extends LinkedHashMap<K, V> {

	private int max_capacity; // 可以自定义最大容量

	public LRU(int initialCapacity) {
		super(initialCapacity, 0.75F, true);
	}

	public LRU(){}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > 3;
	}
}
