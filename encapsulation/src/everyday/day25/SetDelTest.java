package everyday.day25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description 增强for循环只能迭代，不能删除
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 8:54
 * @Version 1.0
 */
public class SetDelTest {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		Iterator<Integer> iterator = nums.iterator();
		for(;iterator.hasNext();){
			Integer next = iterator.next();
			if(next > 4){
				iterator.remove();
			}
		}
		System.out.println("nums = " + nums);
	}
}
