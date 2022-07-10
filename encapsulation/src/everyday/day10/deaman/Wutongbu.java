package everyday.day10.deaman;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 15:23
 * @Version 1.0
 */
public class Wutongbu {

	private static int number = 0;
	private static final ThreadLocal<Integer> threadLocal = new ThreadLocal();



	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			threadLocal.set(number);
			for (int i = 0; i < 1000; i++) {
				threadLocal.set(threadLocal.get() + 1);
				System.out.println("t1----:" + threadLocal.get());
			}
		});
		Thread t2 = new Thread(() -> {
			threadLocal.set(number);
				for (int i = 0; i < 1000; i++) {
					threadLocal.set(threadLocal.get() + 1);
					System.out.println("t2----:" + threadLocal.get());
				}
		});
		t1.start();
		t2.start();

	}

}
