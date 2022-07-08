package everyday.day8.exception;

import java.util.Scanner;

/**
 * @Description 抛异常
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 9:49
 * @Version 1.0
 */
public class ThrowTest {

	public static void fun(){
		while(true){
			try{
				fun2();
			} catch (IndexOutOfBoundsException e){
				e.printStackTrace();
			}
		}

	}
	public static void fun2(){

			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			if(i > 5){
				System.out.println("no problem");
			}
			else{
//			throw new RuntimeException("输入数字不合法？");
				throw new IndexOutOfBoundsException("数组下标越界了");
			}

	}

	public static void main(String[] args) {
		fun();
//		Scanner scanner = new Scanner(System.in);
//		int i = scanner.nextInt();
//		if(i > 5){
//			System.out.println("no problem");
//		}else{
////			throw new RuntimeException("输入数字不合法？");
//			throw new IndexOutOfBoundsException("数组下标越界了");
//		}
	}

}
