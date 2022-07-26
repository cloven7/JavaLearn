package everyday.day26.bighomework;

/**
 * @Description 大作业-新增和查看商品
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 18:43
 * @Version 1.0
 */
public class Shop {

	public static final String SHOP = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\shop.txt";

	private int id;
	private String name;
	private int price;

	public Shop() {
	}

	public Shop(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shop{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
