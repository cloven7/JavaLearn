package everyday.day14.collection;

import java.util.ArrayList;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/14 15:53
 * @Version 1.0
 */
public class LinkedTest {

	// 接口实验
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// 基于数组 LinkedList 基于链表
		list.add("juruo");
		list.add(0, "aaa");
		list.add(1, "bbb");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("u");
		list2.add("f");
		list2.add("o");

		list.addAll(1,list2);

		list.remove("u");// 删除对象
		list.remove(1);// 删除下标
		

		list.set(0, "woshidaniubi");

		System.out.println("list.toString() = " + list.toString());

	}

}
