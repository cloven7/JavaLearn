package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

import java.util.concurrent.locks.LockSupport;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 19:22
 * @Version 1.0
 */
public class LockSupportTest {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			System.out.println(1);
			UserThread.sleep(1000);
			System.out.println(2);
			LockSupport.park("哈哈哈哈啊哈哈， 我被阻塞啦~~~");
			System.out.println(3);
		});
		thread.start();
		UserThread.sleep(2000);
//		LockSupport.unpark(thread);
		Object blocker = LockSupport.getBlocker(thread);
		System.out.println("blocker = " + blocker);
	}

}
