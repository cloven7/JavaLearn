package everyday.day9.enums;

import static everyday.day9.enums.Enums.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/9 8:50
 * @Version 1.0
 */
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(SPRING.ordinal());
		System.out.println(Enums.values());
		Enums[] enums = Enums.values();
		for (int i = 0; i < 4; i++) {
			System.out.println("enums[i].ordinal() = " + enums[i].getDetail());
		}


	}
}
