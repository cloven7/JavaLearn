package everyday.day10.deaman;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 14:52
 * @Version 1.0
 */
public class Ticket implements Runnable{

	private static Integer COUNT = 100;

	String name;

	public Ticket(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (Ticket.COUNT > 0) {
			UserThread.sleep(100);

			synchronized (Ticket.class){
				System.out.println(name + "出票一张，还剩" + Ticket.COUNT-- + "张！");
			}


		}
	}

	public static void main(String[] args) throws Exception {
		Thread one = new Thread(new Ticket("一号窗口"));
		Thread two = new Thread(new Ticket("二号窗口"));
		one.start();
		two.start();
	}
}