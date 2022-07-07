package everyday.day7.api;

import java.time.LocalDate;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 19:41
 * @Version 1.0
 */
public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now.atStartOfDay().getHour());

	}
}
