package everyday.day10.lock;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/10 16:34
 * @Version 1.0
 */
public class LockTest {

	public static void main(String[] args) {
		synchronized (LockTest.class) {
			int  a = 1;
		}
	}

}
