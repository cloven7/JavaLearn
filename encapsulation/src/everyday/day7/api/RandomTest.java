package everyday.day7.api;

import java.util.Random;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 20:40
 * @Version 1.0
 */
public class RandomTest {




	public static void main(String[] args) {

		Random random = new Random();
		int a = 0, b;
		while(true){
			b = random.nextInt(100);
			System.out.println(b);
			if(a == b){
				System.out.println("good");
				break;
			}
			else a = b;
		}
	}


}
