package everyday.day10.deaman;

/**
 * @Description 守护线程
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 9:35
 * @Version 1.0
 */
public class Deaman {

	public static void main(String[] args){
		Thread t1 = new Thread(() -> {
			Thread t2 = new Thread(() ->{
				while (true){
					UserThread.sleep(100);
					System.out.println("这是守护线程");
				}

			});
			t2.setDaemon(true);
			t2.start();
			int count = 10;
			while(true){
				UserThread.sleep(3000);
				System.out.println("这是用户线程");
				if(count-- == 0){
					break;
				}
			}

		}
		);
//		t1.setDaemon(true);
		t1.start();
	}


}
