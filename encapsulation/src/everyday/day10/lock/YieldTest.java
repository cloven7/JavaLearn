package everyday.day10.lock;

/**
 * @Description yield函数，厕所那哥们
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 18:38
 * @Version 1.0
 */
public class YieldTest {

	public static int COUNT1 = 0;
	public static int COUNT2 = 0;

	public static void add1(){
		System.out.println(Thread.currentThread().getName() + " : " + COUNT1++);
	}
	public static void add2(){
		System.out.println(Thread.currentThread().getName() + " : " + COUNT2++);
	}

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				Thread.yield();
				add1();
			}

		}, "thread1").start();


		new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				add2();
			}
		}, "thread2").start();

	}

}
