package everyday.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description 工具类
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 9:52
 * @Version 1.0
 */
public class CollectionsToolTest {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, 1, 2, 3, 4);

		// 一幅扑克🎴
		Collections.shuffle(nums); // 打乱
		System.out.println("nums = " + nums);


		//
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); // 这个返回值不是ArraysList， 但和AL都有共同父类List


	}
}
