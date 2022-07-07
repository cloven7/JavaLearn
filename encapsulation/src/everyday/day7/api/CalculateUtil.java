package everyday.day7.api;

import java.math.BigDecimal;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 20:32
 * @Version 1.0
 */
public class CalculateUtil {

	public static double plus(double n1, double n2){
		String d1 = Double.toString(n1);
		String d2 = Double.toString(n2);

		BigDecimal res = new BigDecimal(d1);
		res = res.add(new BigDecimal(d2));
//		String s1 = "123.12310";
//		return Double.valueOf(s1);
		return res.doubleValue();
	}

	public static void main(String[] args) {
		System.out.println(CalculateUtil.plus(0.1, 0.2));
	}

}
