package everyday.day10.jmmProblems;

/**
 * @Description 在指令重排中，有一个经典的as-if-serial语义，计算机会安装该语义对指令进行优化，
 * 其目的是不管怎么重排序（编译器和处理器为了提高并行度），（单线程）程序的执行结果不能被改变。
 * 为了遵守as-if-serial语义，编译器和处理器不会对存在数据依赖关系的操作做重排序，
 * 因为这种重排序会改变执行结果。
 * 但是，如果操作之间不存在数据依赖关系，这些操作依然可能被编译器和处理器重排序。
 *
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 11:08
 * @Version 1.0
 */
public class OutOfOrderExecution {
	private static int x = 0, y = 0;
	private static int a = 0, b = 0;
	private static int count = 0;

	private static volatile int NUM = 0;

	public static void main(String[] args)
			throws InterruptedException {
		long start = System.currentTimeMillis();
		for (;;) {
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					a = 1;
					x = b;
				}
			});
			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					b = 1;
					y = a;
				}
			});
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("一共执行了：" + (count++) + "次");
			if(x==0 && y==0){
				long end = System.currentTimeMillis();
				System.out.println("耗时：+"+ (end-start) +"毫秒，(" + x + "," + y + ")");
				break;
			}
			a=0;b=0;x=0;y=0;
		}
	}
}
