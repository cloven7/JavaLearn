/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/23 15:26
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		String s = "tmmzuxt";

		/***
		 * 滑动窗口方法
 		 */
		/*if(s.length() == 0)
			return 0;
		int left = 0, max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				left = Math.max(left, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - left + 1);
		}
		return max;*/

		/*
		 * 自己的方法
		// 记录当前最长的长度
		int maxTemp = 0, max = 0;
		// 记录当前最长的下标
		int index = 0;
		//
		HashMap<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < s.length(); i++){
			String putIn = new String(String.valueOf(s.charAt(i)));
			Integer indexRe = hashMap.get(putIn);
			if(indexRe == null){
				maxTemp++;
				if(i == s.length() - 1){
					max = maxTemp > max ? maxTemp : max;
				}
			}else{
				max = maxTemp > max ? maxTemp : max;
				maxTemp = i - indexRe;

				for(int j = index; j <= indexRe; j++){
					hashMap.remove(String.valueOf(s.charAt(j)));
				}
				//hashMap.remove(putIn);
				index = indexRe + 1;
			}
			hashMap.put(putIn, i);
		}

		System.out.println("max = " + max);*/
	}

}
