package everyday.day9.multithreading;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/9 10:42
 * @Version 1.0
 */
public class UseThread extends Thread{

	@Override
	public void run() {

		System.out.println(2);
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		new UseThread().start();
		UseThread useThread = new UseThread();
		useThread.start();

		Thread.sleep(10);// 主线程、main方法产生的主线程
		System.out.println(3);

	}
}
