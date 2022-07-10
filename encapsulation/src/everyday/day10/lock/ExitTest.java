package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

/**
 * @Description 线程退出
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 19:06
 * @Version 1.0
 */
public class ExitTest {

	public static boolean flag = true;

	public static void main(String[] args) {

		new Thread(() -> {
			while(flag){

			}System.out.println("t1");
		}).start();

		UserThread.sleep(1000);
		flag = false;

	}

}
