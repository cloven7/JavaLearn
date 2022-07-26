package everyday.day13.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import everyday.day10.deaman.UserThread;

import java.util.concurrent.*;

/**
 * @Description JDK自带的线程池会出现OOM问题，需要自定义线程池
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 15:51
 * @Version 1.0
 */
public class APool {

	public static void main(String[] args) {

		Runnable task = () -> {
			UserThread.sleep(2000);
			System.out.println("------------------");
		};

//		ExecutorService executorService = new ThreadPoolExecutor(5, 10,
//				60L, TimeUnit.SECONDS,
//				new ArrayBlockingQueue<Runnable>(50),
//				Executors.defaultThreadFactory(),
//				new ThreadPoolExecutor.AbortPolicy());

//				ExecutorService executorService = new ThreadPoolExecutor(5, 10,
//				60L, TimeUnit.SECONDS,
//				new ArrayBlockingQueue<Runnable>(50),
//				new MyThreadFactory(),
//				new ThreadPoolExecutor.AbortPolicy());

//		ExecutorService executorService = new ThreadPoolExecutor(5, 10,
//				60L, TimeUnit.SECONDS,
//				new ArrayBlockingQueue<Runnable>(50),
//				new MyThreadFactory(),
//				(r, e) -> {
//					System.out.println("拒绝！");
//				});
		// 谷歌guava的jar包
		ExecutorService executorService = new ThreadPoolExecutor(5, 10,
				60L, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(50),
				new ThreadFactoryBuilder().setNameFormat("juruo").build(),
				(r, e) -> {
					System.out.println("拒绝！");
				});


		for (int i = 0; i < 610; i++) {
//			System.out.println(i);
			UserThread.sleep(1000);
			executorService.submit(task);
//			new Thread(task).start();
		}
		executorService.shutdown();


	}

}
