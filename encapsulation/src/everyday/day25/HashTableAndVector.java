package everyday.day25;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/**
 * @Description ArrayList, HashMap会有线程安全问题，Vector, HashTable是线程安全的
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 10:21
 * @Version 1.0
 */
public class HashTableAndVector {
	public static void main(String[] args) throws InterruptedException {
/*		final ArrayList<Integer> list = new ArrayList<>();
		CountDownLatch countDownLatch = new CountDownLatch(200);
		for (int i = 0; i < 200; i++) {
			new Thread(()->{
				try{
					Thread.sleep(10);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				list.add(1);
				countDownLatch.countDown();
			}).start();
		}
		countDownLatch.await();
		System.out.println("list.size() = " + list.size());*/

		final List<Integer> list = new Vector<>();
		CountDownLatch countDownLatch = new CountDownLatch(200);
		for (int i = 0; i < 200; i++) {
			new Thread(()->{
				try{
					Thread.sleep(10);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				list.add(1);
				countDownLatch.countDown();
			}).start();
		}
		countDownLatch.await();
		System.out.println("list.size() = " + list.size());

	}

}
