package everyday.day8.error;

/**
 * @Description 错误,不是异常，难以解决
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 8:46
 * @Version 1.0
 */
public class ErrorTest {

	public static void fun(){
		fun();
	}

	public static void main(String[] args) {
//		byte[] bytes = new byte[1024 * 1024];
//		fun();
		System.out.println("ab".hashCode());
	}

}
