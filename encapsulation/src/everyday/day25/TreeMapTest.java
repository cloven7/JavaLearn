package everyday.day25;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 9:34
 * @Version 1.0
 */
public class TreeMapTest {

	public static void main(String[] args) {
		// 引用对象实现TreeMap中的Comparable方法，可以在对象中实现Comparable接口中的CompareTo方法，或者像下面这样实现一个比较方法
		Map<String, String> map = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
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
