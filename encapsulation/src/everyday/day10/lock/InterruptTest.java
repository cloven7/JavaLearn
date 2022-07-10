package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 18:54
 * @Version 1.0
 */
public class InterruptTest {

	public static Object object = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread(()->{

			synchronized (object){
				System.out.println("begin");
//				UserThread.sleep(1000000000);
				try {
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("end");
			}

		});
		t1.start();
		UserThread.sleep(2000);
		t1.interrupt();


	}

}
