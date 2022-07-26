package everyday.day25;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description 有序的HashMap 数组+链表的基础上维护了一个双向链表
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 8:58
 * @Version 1.0
 */
public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>(16);
		map.put("123", "cba");
		map.put("1234", "cba");
		map.put("1231", "cba");
		map.put("1232", "cba");
		map.put("1233", "cba");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String, String> next = iterator.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
		}


	}

}
