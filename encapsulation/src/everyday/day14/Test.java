package everyday.day14;

import java.util.ArrayList;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/15 22:11
 * @Version 1.0
 */
public class Test {

	public ArrayList addTwoNumbers(ArrayList l1, ArrayList l2) {
		ArrayList res = new ArrayList();
		int l1Num, l2Num, addNum = 0;
		
		int maxLen = Math.max(l1.size(), l2.size());
		for (int i = 0; i < maxLen; i++) {
			if(i < l1.size())
				l1Num = (int)l1.get(i);
			else
				l1Num = 0;
			if(i < l2.size())
				l2Num = (int)l2.get(i);
			else
				l2Num = 0;

			res.add((l1Num + l2Num + addNum) % 10);
			addNum = (l1Num + l2Num + addNum) / 10;

		}
		return res;
	}

	public static void main(String[] args) {

	}

}
