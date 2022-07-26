package everyday.day25;

import java.util.*;

/**
 * @Description 并发修改异常
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 9:59
 * @Version 1.0
 */
public class ExceptProblemTest {

	public static void main(String[] args) {
		test2();
	}

	public static void test1(){
		List<String> names = new ArrayList<>();
		Collections.addAll(names, "lucy", "lily");
//		for(String name : names){
//			if("lily".equals(name)){
//				names.remove(name);
//			}
//		}

		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			if("lily".equals(next)){
				names.remove(next);
			}
		}
	}
	public static void test2(){
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			nums.add(new Random().nextInt(100000000));
		}
		for(int i = 0; i < 20; i++){
			new Thread(()->{
				Iterator<Integer> iterator = nums.iterator();
				while(iterator.hasNext()){
					Integer next = iterator.next();
					if(next > 1000){
						iterator.remove();
					}
				}
			}).start();
		}
	}

}
