package everyday.day12;

import everyday.day10.deaman.UserThread;

/**
 * @Description 证明volatile不具备原子性
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/12 8:46
 * @Version 1.0
 */
class AtomicTest {

	public static volatile int COUNT = 0;
	public static volatile int COUNT1 = 0;
	public static boolean flag;

	public synchronized static boolean compareAndSwap(int expect, int update){
		if(expect == COUNT){
			COUNT = update;
			return true;
		}
		return false;
	}

	public synchronized static boolean compareAndSwap1(int expect, int update){
		if(expect == COUNT1){
			COUNT1 = update;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5000; i++) {
			new Thread(()->{
				UserThread.sleep(1);

					COUNT++;

				/*
				取数、压栈、弹栈、加、赋值
				 */
			}).start();

		}
		System.out.println(COUNT);



		for (int i = 0; i < 5000; i++) {
			new Thread(()->{
				UserThread.sleep(10);
				boolean flag = false;

				while(!compareAndSwap1(COUNT1, COUNT1+1)){

				}

				/*
				取数、压栈、弹栈、加、赋值
				 */
			}).start();

		}
		UserThread.sleep(3);
		System.out.println("COUNT1 = " + COUNT1);
	}

}
