package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

/**
 * @Description 死锁 死锁产生条件 thread1持有1号锁请求2号锁，thread2持有2号锁请求1号锁，造成死锁
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 17:47
 * @Version 1.0
 */
public class DeadLock {

	public static final Object MONITOR1 = new Object();
	public static final Object MONITOR2 = "0712";

	public static void main(String[] args) {
		new Thread(() -> {
			synchronized (MONITOR1){
				System.out.println(Thread.currentThread().getName() + "获取一号锁！");
				UserThread.sleep(100);
				synchronized (MONITOR2){
					System.out.println(Thread.currentThread().getName() + "获取二号锁！");
				}
			}

		}, "thread1").start();


		new Thread(() -> {
			synchronized (MONITOR2){
				System.out.println(Thread.currentThread().getName() + "获取二号锁！");
				UserThread.sleep(100);
				synchronized (MONITOR1){
					System.out.println(Thread.currentThread().getName() + "获取一号锁！");
				}
			}

		}, "thread2").start();


	}



}
