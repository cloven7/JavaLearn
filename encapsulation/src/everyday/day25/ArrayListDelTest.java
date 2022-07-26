package everyday.day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 迭代中删除元素
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 8:41
 * @Version 1.0
 */
public class ArrayListDelTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("tom");
		names.add("tom");
		names.add("tom");
		names.add("tom");
		names.add("tom");
		names.add("tom1");
		names.add("tom2");
		names.add("tom3");
		names.add("tom4");
		names.add("tom5");
//		names.remove(1);
		// 指针回调

		/*for (int s = 0; s < names.size(); s++) {
			if(names.get(s).equals("tom")) {
				names.remove(s);

				s--;
			}
		}
		System.out.println("names.toString() = " + names.toString());*/

		// 倒序删除
		/*for (int i = names.size() - 1; i >= 0; i--) {
			if(names.get(i).equals("tom")) {
				names.remove(i);
			}
		}
		System.out.println("names.toString() = " + names.toString());*/

		// 迭代器删除
		Iterator<String> iterator = names.iterator();
		for(;iterator.hasNext();){
			String next = iterator.next();
			if("tom".equals(next)){
				iterator.remove();
			}
		}
		System.out.println("names.toString() = " + names.toString());

	}

}
