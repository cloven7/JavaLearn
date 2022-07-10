package everyday.day9.multithreading;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/9 10:49
 * @Version 1.0
 */
public class UseRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(2);
	}

	public static void main(String[] args) {
		System.out.println(1);
		new Thread(new UseRunnable()).start();
		System.out.println(3);

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(4);
			}
		}).start();
		// Lammbda
		new Thread(() -> {
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
		}
		).start();

	}
}
