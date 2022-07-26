package everyday.day25;

import java.util.Iterator;
import java.util.Map;

/**
 * @Description 基于LinkedHashMap实现LRU算法缓存
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 9:10
 * @Version 1.0
 */
public class LRULinekedHashMap {
	// LRU 最近最少使用
	public static void main(String[] args) {
		Map<String, String> map = new LRU<>(16);
		map.put("12", "cba");
		map.put("121", "cba");
		map.put("122", "cba");
		map.put("123", "cba");
		map.put("124", "cba");

		map.get("123");
		map.put("1", "cba");

		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> next = iterator.next();
			System.out.println(next.getKey());
		}
	}

}
