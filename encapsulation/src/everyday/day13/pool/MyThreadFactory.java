package everyday.day13.pool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/13 16:02
 * @Version 1.0
 */
public class MyThreadFactory implements ThreadFactory {

	private final AtomicInteger threadNumber = new AtomicInteger(1);



	MyThreadFactory(){

	}

	@Override
	public Thread newThread(Runnable r) {
		return new Thread(r, "juruo yige");
	}
}
