package everyday.day22;

import java.util.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/22 8:47
 * @Version 1.0
 */
public class iter {


	public static void main(String[] args) {

		HashSet<String> strings = new HashSet<>();
		strings.add("a");
		strings.add("n");
		strings.add("c");

		Iterator<String> iterator = strings.iterator();
		// 问下一个
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println("next = " + next);



		}
		HashMap<Integer, String> hashMap = new HashMap<>();

		// 第一种方法遍历HashMap
		Set<Integer> integers = hashMap.keySet();
		Iterator<Integer> integerIterator = integers.iterator();
		while (integerIterator.hasNext()) {
			Integer key = integerIterator.next();
			System.out.println("key = " + key);
			System.out.println("hashMap.get(key) = " + hashMap.get(key));

		}

		// 第二种方法遍历HashMap
		Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
		while (iterator1.hasNext()) {
			Map.Entry<Integer, String> next = iterator1.next();
			System.out.println("next.getKey() = " + next.getKey());
			System.out.println("next.getValue() = " + next.getValue());

		}
		// 语法糖：增强for循环
		for(String i : strings){
			System.out.println("i = " + i);
		}

	}

	public static void print(List<String> list){
		int i = 0;

		while(i < list.size()){
			System.out.println(list.get(i));
			i++;
		}
	}

}



