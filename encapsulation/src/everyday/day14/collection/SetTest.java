package everyday.day14.collection;

import java.util.HashSet;

/**
 * @Description 父类 Set
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/14 16:26
 * @Version 1.0
 */
public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("aaa");
		hashSet.add("bbb");
		hashSet.add("ccc");
		hashSet.add("aaa");
		System.out.println(hashSet);
		String s = "dsjfo";
		StringBuilder stringBuilder = new StringBuilder(s);


	}

}
