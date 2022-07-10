package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 16:00
 * @Version 1.0
 */
public class SynchronizedTest {

//	public synchronized void say(){
//		System.out.println("say!");
//		System.out.println(Math.random());
//	}

	//public static SynchronizedTest synchronizedTest = new SynchronizedTest();

	public static Object object = new Object();

	public void say(){
		synchronized (this){
			UserThread.sleep(100);
			System.out.println("say!");

		}

	}

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			new Thread(()->{
				SynchronizedTest synchronizedTest = new SynchronizedTest();
				synchronizedTest.say();
				System.out.println(Math.random());
			}).start();
		}

	}
}
