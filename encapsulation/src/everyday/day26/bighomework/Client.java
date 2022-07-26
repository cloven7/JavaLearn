package everyday.day26.bighomework;

import java.io.*;
import java.util.*;

import static everyday.day26.bighomework.Shop.SHOP;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 18:45
 * @Version 1.0
 */
public class Client {


	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while(true){
			System.out.println("请选择功能：1.插入新商品 2.删除商品 3.修改商品 4.查看商品 5.查看一个商品 6.退出");
			int function = scanner.nextInt();
			switch (function){
				case 1:
					insert();
					break;
				case 2:
					delete();
					break;
				case 3:
					update();
					break;
				case 4:
					check();
					break;
				case 5:
					findOne();
					break;
				default:
					System.exit(-1);
					break;
			}
		}
	}

	// 增加商品
	private static void insert() {
		int id;
		while(true){
			System.out.println("请输入商品编号：");
			// 最简单，直接追加
			id = scanner.nextInt();
			int finalIds = id;
			boolean b = findAllGoods().stream().anyMatch(g -> g.getId() == finalIds);
			if(b)
				System.out.println("商品编号已存在，请重新输入！！！");
			else
				break;
		}
		System.out.println("请输入商品名字：");
		String name = scanner.next();
		System.out.println("请输入商品价格：");
		int price = scanner.nextInt();


		// 输出到文件
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(SHOP, true);
			String shop = id + " " + name + " " + price + "\r\n";
			outputStream.write(shop.getBytes());
			outputStream.flush();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}



	}

	// 检查商品
	/*private static void check(){
		try(Reader reader = new FileReader(SHOP);
			BufferedReader bufferedReader = new BufferedReader(reader);
		){
			String goods;
			while((goods = bufferedReader.readLine()) != null){
				System.out.println(goods);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}*/
	private static void check(){
		List<Shop> goodsList = findAllGoods();
		for (Shop shop : goodsList) {
			System.out.println("shop = " + shop);
		}
	}

	// 查找其中一个商品
	private static void findOne(){
		System.out.println("请输入商品编号：");
		int id = scanner.nextInt();
		// 函数式编程找到第一个id的商品
		Optional<Shop> first = findAllGoods().stream().filter(g -> id == g.getId()).findFirst();
		if(first.isPresent()){
			Shop shop = first.get();
			System.out.println("shop = " + shop);
		}else{
			System.out.println("您需要的商品不存在！！！");
		}
	}

	// 删除其中一个商品
	private static void delete(){
		int id;
		while(true){
			System.out.println("请输入商品编号：");
			id = scanner.nextInt();
			int finalIds = id;
			boolean b = findAllGoods().stream().anyMatch(g -> g.getId() == finalIds);
			if(!b)
				System.out.println("商品编号不存在，请重新输入！！！");
			else
				break;
		}
		// 在内存中删除
		List<Shop> allGoods = findAllGoods();
		Iterator<Shop> iterator = allGoods.iterator();
		while(iterator.hasNext()){
			Shop next = iterator.next();
			if(next.getId() == id){
				iterator.remove();
			}
		}
		// 重新写回
		try(Writer writer = new FileWriter(SHOP);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
		) {
			for (Shop allGood : allGoods) {
				bufferedWriter.write(allGood.getId() + " " + allGood.getName() + " " + allGood.getPrice() + "\r\n");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	// 修改其中一个商品
	private static void update(){
		int id;
		while(true){
			System.out.println("请输入商品编号：");
			id = scanner.nextInt();
			int finalIds = id;
			boolean b = findAllGoods().stream().anyMatch(g -> g.getId() == finalIds);
			if(!b)
				System.out.println("商品编号不存在，请重新输入！！！");
			else
				break;
		}
		System.out.println("请输入商品名字：");
		String name = scanner.next();
		System.out.println("请输入商品价格：");
		int price = scanner.nextInt();
		// 在内存中删除
		List<Shop> allGoods = findAllGoods();
		Iterator<Shop> iterator = allGoods.iterator();
		while(iterator.hasNext()){
			Shop next = iterator.next();
			if(next.getId() == id){
				next.setName(name);
				next.setPrice(price);
			}
		}
		// 重新写回
		try(Writer writer = new FileWriter(SHOP);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
		) {
			for (Shop allGood : allGoods) {
				bufferedWriter.write(allGood.getId() + " " + allGood.getName() + " " + allGood.getPrice() + "\r\n");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * @Description 从磁盘中获取所有商品
	 * @Return java.lang.String
	 */
	// 得到所有商品
	private static List<Shop> findAllGoods(){
		List<Shop> goodsList = new ArrayList<>();

		try(Reader reader = new FileReader(SHOP);
			BufferedReader bufferedReader = new BufferedReader(reader);
		){
			String goods;
			while((goods = bufferedReader.readLine()) != null){
//				System.out.println(goods);
				String[] goodsElem = goods.split(" ");
				Shop shopItem = new Shop(Integer.parseInt(goodsElem[0]), goodsElem[1], Integer.parseInt(goodsElem[2]));
				goodsList.add(shopItem);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		return goodsList;
	}
}
