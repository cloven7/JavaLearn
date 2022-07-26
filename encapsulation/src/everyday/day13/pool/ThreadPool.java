package everyday.day13.pool;

import everyday.day10.deaman.UserThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 线程池
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 10:25
 * @Version 1.0
 */
public class ThreadPool {

	public static void main(String[] args) {


		Runnable task = () -> {
			UserThread.sleep(2000);
			System.out.println("------------------");
		};
		ExecutorService executorService = null;
		int type = 1;
		switch (type){
			// 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
			case 1:
				executorService = Executors.newFixedThreadPool(5);
				break;
			// 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
			case 2:
				executorService = Executors.newCachedThreadPool();
				break;
			// 创建一个定长线程池，支持定时及周期性任务执行。
			case 3:
				executorService = Executors.newScheduledThreadPool(5);
				break;
			// 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序执行。
			case 4:
				executorService = Executors.newSingleThreadExecutor();
				break;
			default:
				break;
		}

		for (int i = 0; i < 50; i++) {
			executorService.submit(task);
		}


	}


}
