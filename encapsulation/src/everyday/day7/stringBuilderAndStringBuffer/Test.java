package everyday.day7.stringBuilderAndStringBuffer;

/**
 * @Description StringBuilder 和 StringBuffer 的对比
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/7 21:26
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) {
//		String a = "a";
//		a = a + "f";// 字符串不可变，所以要创建三个对象
//
//		StringBuilder sb = new StringBuilder("g");
//		System.out.println("sb.append(\"a\").append(123).append(\"sdfasfa\") = " + sb.append("a").append(123).append("sdfasfa"));
//		System.out.println(sb.length());
//		sb.insert(0,"sjjjjf");
//		System.out.println(sb);
//		sb = sb.reverse();
//		System.out.println(sb);
		long start = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder("g");
		for (int i = 0; i < 100000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		start = System.currentTimeMillis();

		StringBuffer sbs = new StringBuffer("g");
		for (int i = 0; i < 100000; i++) {
			sbs.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);



		String sbss = new String("g");
		for (int i = 0; i < 100000; i++) {
			sbss+="a";

		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
