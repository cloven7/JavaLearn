package everyday.day8.workException;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 15:03
 * @Version 1.0
 */
public class KeyCode {
//
//	try catch // 越精准越好
//	throws // 不能用在业务上，通常是测试
//	finally // 有没有异常都要执行finally中的代码


	public static int test(){
		int i = 1;
		try{
			i++;
			System.out.println("--- " + i +" ---");
			return i;
		}catch(Exception e){
			i++;
			System.out.println("--- " + i);
			return i;
		}finally {
			i = 10;
			System.out.println("finally " + i);
		}
	}
	public static void main(String[] args) {
		int res = test();
		System.out.println(res);
	}

}
