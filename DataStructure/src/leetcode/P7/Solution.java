package leetcode.P7;

import org.junit.Test;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 19:36
 * @Version 1.0
 */
public class Solution {

	@Test
	public void reverseTest(){
		System.out.println("reverse(-123) = " + reverse(-153));
	}

	public int reverse(int x) {
		long ans = 0, data = 1;
		int low = -(1 << 31);
		int hig = (1 << 31) - 1;
		int type = x < 0 ? 0 : 1;
		x = Math.abs(x);

		while(x / data != 0){
			data *= 10;
		}
		data /= 10;
		int reverseData = 1;
		while(data != 0){
			ans += reverseData * ((x / data) % 10);
			data /= 10;
			reverseData *= 10;
		}

		ans = type == 0 ? -ans : ans;
		if(ans > hig || ans < low)
			return 0;
		return (int)ans;
	}

}
