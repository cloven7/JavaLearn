package everyday.day13.pool;

import everyday.day10.deaman.UserThread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 等CountDownLatch的值为0，才能继续执行，否则开在await处
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 18:12
 * @Version 1.0
 */
public class CountDownLauch {


	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		CountDownLatch countDownLatch = new CountDownLatch(3);


		Runnable task1 = () -> {
			UserThread.sleep(new Random().nextInt(5000));
			System.out.println("计算山西分公司的账目");
			countDownLatch.countDown();
		};

		Runnable task2 = () -> {
			UserThread.sleep(new Random().nextInt(5000));
			System.out.println("计算北京分公司的账目");
			countDownLatch.countDown();
		};

		Runnable task3 = () -> {
			UserThread.sleep(new Random().nextInt(5000));
			System.out.println("计算深圳分公司的账目");
			countDownLatch.countDown();
		};

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		countDownLatch.await();
		System.out.println("计算完成");
		executorService.shutdown();
	}

}
