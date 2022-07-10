package everyday.day10.deaman;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 14:11
 * @Version 1.0
 */
public class MemorySee {
	public volatile static boolean flag = false;

	public static void main(String[] args) {

		new Thread(() -> {
			while(!flag){
//				System.out.println("1213");
			}
			System.out.println("Can you see me>>>");
		}).start();
		UserThread.sleep(2000);
		flag = true;
	}
}
