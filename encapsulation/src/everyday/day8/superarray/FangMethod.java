package everyday.day8.superarray;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 16:38
 * @Version 1.0
 */
public class FangMethod {

	public static <T> T play(T value){

		System.out.println("value.toString() = " + value.toString());
		return value;
	}

	public static void main(String[] args) {

		play("aab");
		play(1);
		play("aab");
		play("aab");

	}

}
