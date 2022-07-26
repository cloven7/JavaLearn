package leetcode.P6;

import org.junit.Test;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 18:38
 * @Version 1.0
 */
public class Solution {
/**
 * 1 1
 * 2 2
 * 3 4
 * 4 6
 */
	@Test
	public void convertTest(){
		System.out.println("convert() = " + convert2("PAYPALISHIRING", 3));
	}

	public String convert2(String s, int numRows) {
		if(numRows == 1 || s.length() < numRows)
			return s;
		String res = "";
		String[] ans = new String[numRows];
		for (int i = 0; i < numRows; i++) {
			ans[i] = "";
		}
		int tag = 0, count = 0;
		for(int i = 0; i < s.length(); i++){
			if(tag == 0){
//				index[i] = count;
				ans[count] += s.charAt(i);
				count++;
				if(count == numRows){
					count--;
					tag = 1;
				}
			}else{
				count--;
//				index[i] = count;
				ans[count] += s.charAt(i);
				if(count == 0){
					count++;
					tag = 0;
				}
			}
		}
		for (int i = 0; i < numRows; i++) {
			res += ans[i];
		}
		return res;
	}


	// 蛮力
	/*public String convert1(String s, int numRows) {
		if(numRows == 1)
			return s;
		String res = "";
		int[] index = new int[s.length()];
		int tag = 0, count = 0;
		for(int i = 0; i < s.length(); i++){
			if(tag == 0){
				index[i] = count;
				count++;
				if(count == numRows){
					count--;
					tag = 1;
				}
			}else{
				count--;
				index[i] = count;
				if(count == 0){
					count++;
					tag = 0;
				}
			}
		}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < s.length(); j++) {
				if(index[j] == i)
					res += s.charAt(j);
			}
		}
		return res;
	}*/


	public String convert(String s, int numRows) {
		if(numRows == 1)
			return s;
		String res = "";
		for(int i = 0; i < numRows; i++){
			int moveCharacter = 0;
			int temp = numRows - i > i ? numRows - i : i;
			while(i + moveCharacter < s.length()){
				res += s.charAt(i + moveCharacter);
				moveCharacter += temp * 2;
			}
		}
		return res;
	}

}
