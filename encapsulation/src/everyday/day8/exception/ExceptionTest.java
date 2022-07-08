package everyday.day8.exception;

import everyday.day5.polymorphism.Cat;
import everyday.day5.polymorphism.Dog;
import everyday.day5.polymorphism.Pet;

import java.util.regex.Pattern;

/**
 * @Description 异常
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 9:13
 * @Version 1.0
 */
public class ExceptionTest {

	public static void main(String[] args) {
		// 常见的非检测性异常
		String str = null;
		/**1**/
		if(str != null) // 简单的业务逻辑规避异常
			System.out.println(str.equals("123")); // 阿里规约里面，常量和变量进行比较，常量在前
		/**2**/
		Pet pet = new Dog();
		if(pet instanceof Cat){
			Cat cat = (Cat)pet;
		}
		/**3**/
		int[] nums = new int[3];
		int i = 3;
		if(i > -1 && i < nums.length){
			nums[i] = 4;
		}
		/**4**/
		String str1 = "123&";
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");

		if(pattern.matcher(str1).matches()){
			int num = Integer.parseInt(str1);
			System.out.println(num);
		}



		// 常见的检测性异常
		try{
			Class.forName("com.baidu.wenku");
		}catch (ClassNotFoundException e){
			System.out.println("404");
			e.printStackTrace();
		}

		// 中断异常
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("wait 3 ms");
	}

}
