package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

/**
 * @Description 使用 wait 和 notify 解决锁相关问题
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 18:08
 * @Version 1.0
 */
public class WaitAndNotify {

	public static final Object MONITOR = new Object();

	public static void main(String[] args) {
		new Thread(() -> {
			synchronized (MONITOR){
				System.out.println("线程1开始了");
				try {
					MONITOR.wait(); // 释放锁
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程1结束了");
			}
		}).start();

		new Thread(() -> {
			synchronized (MONITOR){
				System.out.println("线程2开始了");
				UserThread.sleep(1000);
				MONITOR.notify();
				System.out.println("线程2结束了");
			}
		}).start();


	}

}
