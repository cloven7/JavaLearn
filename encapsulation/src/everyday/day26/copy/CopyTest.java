package everyday.day26.copy;


import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/26 18:09
 * @Version 1.0
 */
public class CopyTest {
	String to = "C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt";
//	@Test
//	public void objectTest() throws IOException {
//
//		OutputStream outputStream = new FileOutputStream("C:\\Users\\19048\\Desktop\\JAVA_LEET\\video\\b.txt");
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//		// 写一个对象到磁盘 序列化
//		everyday.day26.io.serialization.User user = new everyday.day26.io.serialization.User(12);
//		objectOutputStream.writeObject(user);
//		objectOutputStream.close();
//		outputStream.close();
//	}
	// 浅拷贝
	@Test
	public void deepTest() throws CloneNotSupportedException {

		User user = new User(12, "zhangsan", new Dog(12));

		User user1 = (User) user.clone(); // 浅拷贝
		user.setAge(123);
		user.getDog().setAge(12312);
		System.out.println("user1 = " + user1);

	}

	// 序列化实现深拷贝
	@Test
	public void deepCopyTest2() throws IOException, ClassNotFoundException {
		User user = new User(12, "zhangsan", new Dog(12));

		// 将对象写到字节数组当中
//		OutputStream outputStream = new ByteArrayOutputStream();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(user);

		// 获取字节数组
		byte[] bytes = outputStream.toByteArray();
		// 用输入流读出
		ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		User user1 =  (User) objectInputStream.readObject();
		user.getDog().setAge(1231231);

		System.out.println("user1 = " + user1);
	}
	// 工具类实现深拷贝
	@Test
	public void deepCopyTest3() throws IOException, ClassNotFoundException {
		User user = new User(12, "zhangsan", new Dog(12));

		User user1 = DeepCopyUtil.deepCopy(user);

		user.getDog().setAge(12313);
		System.out.println("user1 = " + user1);
	}

}
