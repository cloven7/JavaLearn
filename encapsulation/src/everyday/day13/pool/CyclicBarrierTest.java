package everyday.day13.pool;

import everyday.day10.deaman.UserThread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 循环栅栏
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 18:24
 * @Version 1.0
 */
public class CyclicBarrierTest {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		// 计算总账的主线程
		Runnable main = () -> System.out.println("计算总账！");
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, main);

		Runnable task1 = () -> {
			UserThread.sleep(new Random().nextInt(5000));
			System.out.println("1");
			try{
				cyclicBarrier.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable task2 = () -> {
			UserThread.sleep(new Random().nextInt(5000));
			System.out.println("2");
			try{
				cyclicBarrier.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable task3 = () -> {
			UserThread.sleep(new Random().nextInt(5000));
			System.out.println("3");
			try{
				cyclicBarrier.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		pool.submit(task1);
		pool.submit(task2);
		pool.submit(task3);

		cyclicBarrier.reset();
		pool.submit(task1);
		pool.submit(task2);
		pool.submit(task3);


	}

}
