package leetcode.P5;

import org.junit.Test;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 18:10
 * @Version 1.0
 */
public class Main {

	@Test
	public void longestPalindromeTest(){
		System.out.println("longestPalindrome(\"abbc\") = " + longestPalindrome("babad"));
	}


	public String longestPalindrome(String s) {
		String res = createString(s);
		int max = 0;
		int[] numPalindrome = new int[res.length()];
		for (int i = 0; i < res.length(); i++) {
			int moveIndex = 0;
			while(true){
				moveIndex++;
				if(i - moveIndex < 0 || i + moveIndex >= res.length())
					break;
				if(res.charAt(i + moveIndex) != res.charAt(i - moveIndex))
					break;
			}
			numPalindrome[i] = moveIndex - 1;
			max = numPalindrome[max] < numPalindrome[i] ? i : max;
		}
		String temp = res.substring(max - numPalindrome[max], max + numPalindrome[max]);
		res = "";
		for(int i = 0; i < temp.length(); i++){
			if(temp.charAt(i) == '#'){
				continue;
			}
			res += temp.charAt(i);
		}

		return res;
	}

	public String createString(String s){
		if(s.length() == 0)
			return "^&";
		String res = "^";
		for(int i = 0; i < s.length(); i++){
			res += s.charAt(i);
			if(i != s.length() - 1)
				res += "#";
		}
		res += "&";
		return res;
	}
}
