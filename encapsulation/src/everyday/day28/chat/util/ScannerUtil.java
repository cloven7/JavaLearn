package everyday.day28.chat.util;

import java.util.Scanner;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 19:23
 * @Version 1.0
 */
public class ScannerUtil {

	private static final Scanner scanner = new Scanner(System.in);

	public static String input(){
		return scanner.next();
	}

}
