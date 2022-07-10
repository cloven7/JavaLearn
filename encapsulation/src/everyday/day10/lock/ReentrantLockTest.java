package everyday.day10.lock;

import everyday.day10.deaman.UserThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 19:50
 * @Version 1.0
 */
public class ReentrantLockTest implements Runnable{

	private static final ReentrantLock lock = new ReentrantLock();
	private static Integer COUNT = 100;

	String name;

	public ReentrantLockTest(String name){
		this.name = name;
	}

	public ReentrantLockTest(){

	}

	@Override
	public void run() {
		while(ReentrantLockTest.COUNT > 0){
			UserThread.sleep(100);
			lock.lock();
			try{
				System.out.println(name + "出票一张，还剩" + --ReentrantLockTest.COUNT + "--- 张！");
			}finally {
				lock.unlock();
			}
		}
	}


	public static void main(String[] args) {
		Thread one = new Thread(new ReentrantLockTest("一号窗口"));
		Thread two = new Thread(new ReentrantLockTest("二号窗口"));

		one.start();
		two.start();
		UserThread.sleep(1093939);
	}

}
