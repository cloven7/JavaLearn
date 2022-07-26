package everyday.day13;

import everyday.day10.deaman.UserThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 8:13
 * @Version 1.0
 */
public class AtomicIntegerTest {

	private static AtomicInteger atomicInteger = new AtomicInteger(0);

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {

			new Thread(()->{
				atomicInteger.getAndIncrement();
			}).start();

		}

		UserThread.sleep(1000);
		System.out.println(atomicInteger.get());
	}

}
