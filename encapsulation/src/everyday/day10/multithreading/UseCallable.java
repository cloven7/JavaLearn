package everyday.day10.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 8:37
 * @Version 1.0
 */
public class UseCallable implements Callable<Long> {

	private int from;
	private int to;

	public UseCallable(int from, int to) {
		this.from = from;
		this.to = to;
	}

	public UseCallable() {
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	@Override
	public Long call() throws Exception {
		Long res = 0L;
		for(int i = from; i < to; i++)
			res += i;

		return res;
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
//		System.out.println(1);
//		FutureTask<Long> futureTask = new FutureTask<>(new UseCallable(1, 1231));
//		System.out.println(2);
//		new Thread(futureTask).start();
//		System.out.println(3);
//		Long integer = futureTask.get();
//		System.out.println(4);
//		System.out.println(integer);
//		System.out.println(5);

		long start = System.currentTimeMillis();
		long ans = 0L;
		for (int i = 0; i < 100000000; i++) {
			ans += i;
		}

		long end = System.currentTimeMillis();
		System.out.println("ans = " + ans);
		System.out.println("end - start = " + (end - start));

		System.out.println("-------------------------------");


		long start1 = System.currentTimeMillis();
		ans = 0L;
		FutureTask[] futureTasks = new FutureTask[10];
		for (int i = 0; i < 10; i++) {
			FutureTask<Long> task = new FutureTask<>(new UseCallable(i * 10000000, (i + 1) * 10000000));
			new Thread(task).start();
			futureTasks[i] = task;
		}


		long end1 = System.currentTimeMillis();for (int i = 0; i <10; i++) {
			Long sum = (Long)futureTasks[i].get();
			ans += sum;
		}
		System.out.println("ans = " + ans);
		System.out.println("(end - start) = " + (end1 - start1));


	}
}
