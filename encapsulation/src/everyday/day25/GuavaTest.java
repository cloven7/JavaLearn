package everyday.day25;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import org.junit.Test;

/**
 * @Description 谷歌提供的不可改变的线程安全的集合和hashmap
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 11:17
 * @Version 1.0
 */
public class GuavaTest {

	@Test
	public void junit(){
		System.out.println("jasif");
	}

	public static void main(String[] args) {

		String[] s = {"a", "b", "c"};
		ImmutableList<String> list = ImmutableList.copyOf(s);
		System.out.println("list.size() = " + list.size());
		for (String s1 : list) {
			System.out.println(s1);
		}

		ImmutableMultimap<String, Integer> of = ImmutableMultimap.of("a", 1, "b", 2);

	}

}
