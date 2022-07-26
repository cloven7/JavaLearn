package everyday.day25;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @Description 同是线程安全的类的对比
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/25 14:58
 * @Version 1.0
 */
public class QuickHashTableAndConcurrentHashMap {

	// hashtable和concurrentHashMap的性能测试
	@Test
	public void hashtableTest() throws InterruptedException {
		final Map<Integer,Integer> map = new Hashtable<>(500);
		final CountDownLatch countDownLatch = new CountDownLatch(50);
		System.out.println("----------------开始测试Hashtable------------------");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			final int j = i;
			new Thread(()->{
				for (int k = 0; k < 100000; k++) {
					map.put(j*k,1);
				}
				countDownLatch.countDown();
			}).start();
		}
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("hashtable:(end-start) = " + (end - start));

		// ----------------开始测试ConcurrentHashMap------------------
		System.out.println("----------------开始测试ConcurrentHashMap------------------");
		final Map map2 = new ConcurrentHashMap<>(500);
		final CountDownLatch countDownLatch2 = new CountDownLatch(50);
		start = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			final int j = i;
			new Thread(()->{
				for (int k = 0; k < 100000; k++) {
					map2.put(j*k,1);
				}
				countDownLatch2.countDown();
			}).start();
		}
		countDownLatch.await();
		end = System.currentTimeMillis();
		System.out.println("ConcurrentHashMap:(end-start) = " + (end - start));
	}

	// 基于数组的 用时541毫秒。尾插
	@Test
	public void testArrayListAdd(){
		List<Integer> list = new ArrayList<>();
		Long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add((int)(Math.random()*100));
		}
		Long end = System.currentTimeMillis();
		System.out.printf("用时%d毫秒。",end-start);
	}

	// 基于链表的 用时1421毫秒。尾插
	@Test
	public void testLinkedListAdd(){
		List<Integer> list = new LinkedList<>();
		Long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add((int)(Math.random()*100));
		}
		Long end = System.currentTimeMillis();
		System.out.printf("用时%d毫秒。",end-start);
	}

	// 基于数组的 用时11毫秒。头插
	@Test
	public void testArrayListFor(){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10000000; i++) {
			list.add((int)(Math.random()*100));
		}
		System.out.println("开始------");
		Long start = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		Long end = System.currentTimeMillis();
		System.out.printf("用时%d毫秒。",end-start);
	}

	// 基于链表的 用时1421毫秒。头插
	@Test
	public void testLinkedListFor(){
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < 10000000; i++) {
			list.add((int)(Math.random()*100));
		}
		System.out.println("开始------");
		Long start = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		Long end = System.currentTimeMillis();
		System.out.printf("用时%d毫秒。",end-start);
	}


}
