package everyday.day9.enums;

/**
 * @Description 学习写枚举
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/9 8:36
 * @Version 1.0
 */
public enum Enums {

	// 0 1 2 3
	SPRING("春天", "spring"),
	SUMMER("2", "2"),
	AUTUMN("3", "3"),
	WINTER;

	private String name;
	private String detail;

	Enums() {
	}

	Enums(String name, String detail) {
		this.name = name;
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	//	public static final int SPRING = 1;
//	public static final int SUMMER = 2;
//	public static final int AUTUMN = 3;
//	public static final int WINTER = 4;
	public static void test(Enums enums){
		switch (enums){
			case SPRING:
				System.out.println("春天了");
				break;
			case SUMMER:
				System.out.println("夏天了");
				break;
			case AUTUMN:
				System.out.println("秋天了");
				break;
			case WINTER:
				System.out.println("冬天了");
				break;

		}
	}

}

