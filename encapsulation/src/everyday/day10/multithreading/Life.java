package everyday.day10.multithreading;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 10:27
 * @Version 1.0
 */
public class Life {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("t1");
		});

		Thread t2 = new Thread(() -> {
			System.out.println("t2");
		});

		t1.start();
		t2.start();

		// t1执行完成后，再执行main中的方法
		// t1在那个线程调用，就阻塞那个线程
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("----------------main-----------------");
	}
}
