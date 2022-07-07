package everyday.day7.api;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 21:01
 * @Version 1.0
 */
public class ArraysTest {

	public static void main(String[] args) {
		int[] ints = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			ints[i] = random.nextInt();
		}
		long start = System.currentTimeMillis();

		Arrays.sort(ints);

		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("--------------------------");

		int[] ints1 = new int[ints.length * 2];
		// 拷贝
		System.arraycopy(ints, 0, ints1, 0, ints.length);
		System.out.println(Arrays.toString(ints1));

		int[] ints3 = Arrays.copyOf(ints, ints.length * 2);
	}

}
