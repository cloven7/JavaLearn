package everyday.day10.deaman;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 14:30
 * @Version 1.0
 */
public class Scramble {

	public static int COUNT = 0;

	public synchronized static void add(){
		COUNT++;
	}

	public static StringBuilder stringBuilder = new StringBuilder();
	public synchronized static void appendStringBuilder(){
		stringBuilder.append("a");
	}

	public static StringBuffer stringBuffer = new StringBuffer();
	public static void appendStringBuffer(){
		stringBuffer.append("b");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				appendStringBuffer();
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				appendStringBuffer();
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("COUNT = " + stringBuffer.length());

	}

}
