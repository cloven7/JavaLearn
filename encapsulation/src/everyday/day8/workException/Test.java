package everyday.day8.workException;

import static java.lang.Thread.sleep;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 10:08
 * @Version 1.0
 */
public class Test {

	public static void fun() throws InterruptedException {
		while(true) {
			try {
				fun2();
			} catch (UserErrorException e) {
				sleep(1000);
				System.out.println("用户名，异常被捕获！！");
				System.out.println("e.getCode() = " + e.getCode());
				/****异常链****/
//				PasswordErrorException passwordErrorException = new PasswordErrorException();
//				passwordErrorException.initCause(e);

				e.printStackTrace();
				throw new PasswordErrorException(e);

			} catch (PasswordErrorException e){
				sleep(1000);
				System.out.println("密码，异常被捕获！！");
				e.printStackTrace();
			}
		}
	}
	public static void fun2(){
		int i = (int)(Math.random() * 10);
		if(i > 5)
			throw new PasswordErrorException();
		else
			throw new UserErrorException(504, "用户名错误hhhhhhhhhhhh！");

	}

	public static void main(String[] args) {
		try {
			fun();
		} catch (InterruptedException e){
			e.printStackTrace();
		}

	}

}
