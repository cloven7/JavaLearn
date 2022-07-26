package everyday.day13.pool;

import everyday.day10.deaman.UserThread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Description 信号量 用来限制访问数量
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 18:34
 * @Version 1.0
 */
public class SemaphoreTest {

	public static void main(String[] args) {

		final Semaphore semaphore = new Semaphore(5);
		ExecutorService exec = Executors.newCachedThreadPool();

		for (int index = 0; index < 100; index++) {
			Runnable run = () -> {
				try{
					// 获取许可
					semaphore.acquire();
					System.out.println("开进一辆车");
					UserThread.sleep(new Random().nextInt(5000));
					// 访问完成
					semaphore.release();
					System.out.println("离开一辆车");
				}catch (InterruptedException e){
					e.printStackTrace();
				}
			};
			exec.submit(run);
		}
		exec.shutdown();

	}

}
